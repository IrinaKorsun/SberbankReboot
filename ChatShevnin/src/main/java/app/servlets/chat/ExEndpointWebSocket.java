package app.servlets.chat;

import app.servlets.DBController;

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
        List<Session> sessions = this.sessions.getSessions().get(key);
        for (Session instance : sessions) {
            instance.getAsyncRemote().sendText(message);
        }
    }

    @OnOpen
    public void onOpen(Session session, @PathParam("key") String key) {
        Map<String, List<Session>> sessList = this.sessions.getSessions();
        if (sessList.containsKey(key)) {
            sessList.get(key).add(session);
        } else {
            sessList.put(key, Arrays.asList(session));
        }
        for (Map.Entry<String, List<Session>> entry : sessList.entrySet()) {
            List<Session> activeSessions = entry.getValue();
            if (!entry.getKey().equals(key)) {
                for (Session instance : activeSessions) {
                    instance.getAsyncRemote().sendText("NewConnection:" + key);
                }
            }
        }
        DBController.addLog("CONNECT", null, key, session.toString());
    }

    @OnClose
    public void onClose(Session session, @PathParam("key") String key) {
        Map<String, List<Session>> sessList = sessions.getSessions();
        try {
            sessions.removeSession(key, session);
        } finally {
            for (Map.Entry<String, List<Session>> entry : sessList.entrySet()) {
                if (!entry.getKey().equals(key)) {
                    List<Session> sessionsKey = entry.getValue();
                    for (Session instance : sessionsKey) {
                        instance.getAsyncRemote().sendText("DelConnection:" + key);
                    }
                }
            }
            DBController.addLog("DISCONNECT", null, key, session.toString());
        }
    }

    @OnError
    public void onError(Session session, @PathParam("key") String key, Throwable throwable) {
        this.sessions.getSessions().get(key).remove(session);
        try {
            session.close();
        } catch (IOException ex) {
        }
    }

    public static List<String> getKeys() {
        return new ArrayList<>(sessions.getSessions().keySet());
    }

    public static void send(String message, String key, String sender) {
        List<Session> session = sessions.getSessions().get(key);
        for (Session instance : session) {
            instance.getAsyncRemote().sendText(sender + "> " + message);
            DBController.addLog("MESSAGE", sender, key, message);
        }
    }
}
