package app.servlets.chat;

import javax.websocket.Session;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sessions {

    private static Sessions instance;
    private final Map<String, List<Session>> sessions;

    public static synchronized Sessions getInstance() {
        if (instance == null) {
            instance = new Sessions();
        }
        return instance;
    }

    public Map<String, List<Session>> getSessions() {
        return sessions;
    }

    public void removeSession(String key, Session session) {
        List<Session> sessionsOur = sessions.get(key);
        if (sessionsOur != null) {
            if (sessionsOur.size() < 2) sessions.remove(key);
            else {
                sessionsOur.remove(session);
            }
        }
    }

    Sessions() {
        sessions = new HashMap<>();
    }

}
