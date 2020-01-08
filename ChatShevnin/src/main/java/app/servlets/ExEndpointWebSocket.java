package app.servlets;

import org.json.JSONObject;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.*;

@ServerEndpoint("/ex/{key}")
public class ExEndpointWebSocket {

    private static final Sessions sessions = Sessions.getInstance();

    @OnMessage
    public void onMessage(Session session, String message, @PathParam("key") String key) {
        JSONObject json = new JSONObject(message);
        Map<String, List<Session>> sessList = sessions.getSessions();
        if (json.get("EVENT").toString().equals("HELLO")) {
            JSONObject jsonSend = new JSONObject();
            jsonSend.append("EVENT", "CONNECT");
            jsonSend.append("KEY", json.get("id").toString());
            jsonSend.append("VALUE", json.get("sender").toString());
            for (Map.Entry<String, List<Session>> entry : sessList.entrySet()) {
                List<Session> activeSessions = entry.getValue();
                if (!entry.getKey().equals(key)) {
                    for (Session instance : activeSessions) {
                        instance.getAsyncRemote().sendText(jsonSend.toString());
                    }
                }
            }
        } else if (json.get("EVENT").toString().equals("MESSAGE")) {
            List<Session> sessionList = sessList.get(key);
            for (Session instance : sessionList) {
                instance.getAsyncRemote().sendText(message);
            }
            sessionList = sessList.get(json.get("key").toString());
            for (Session instance : sessionList) {
                instance.getAsyncRemote().sendText(message);
                DBController.addLog("MESSAGE", key, json.get("id").toString(), json.get("message").toString());
            }
        }
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("key") String key) {
        Map<String, List<Session>> sessList = sessions.getSessions();
        if (sessList.containsKey(key)) {
            sessList.get(key).add(session);
        } else {
            sessList.put(key, Arrays.asList(session));
        }
        DBController.addLog("CONNECT", null, key, session.toString());
    }

    @OnClose
    public void onClose(Session session, @PathParam("key") String key) {
        Map<String, List<Session>> sessList = sessions.getSessions();
        try {
            sessions.removeSession(key, session);
        } finally {
            JSONObject json = new JSONObject();
            json.append("EVENT", "DISCONNECT");
            json.append("KEY", key);
            for (Map.Entry<String, List<Session>> entry : sessList.entrySet()) {
                if (!entry.getKey().equals(key)) {
                    List<Session> sessionsKey = entry.getValue();
                    for (Session instance : sessionsKey) {
                        instance.getAsyncRemote().sendText(json.toString());
                    }
                }
            }
            DBController.addLog("DISCONNECT", null, key, session.toString());
        }
    }

    @OnError
    public void onError(Session session, @PathParam("key") String key, Throwable throwable) {
        sessions.getSessions().get(key).remove(session);
        try {
            session.close();
        } catch (IOException ex) {
        }
    }

}
