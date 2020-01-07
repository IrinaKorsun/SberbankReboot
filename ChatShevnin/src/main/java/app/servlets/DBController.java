package app.servlets;

import app.servlets.chat.Sessions;

import javax.websocket.Session;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBController {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "admin";
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    private static Object postgre;
    private static Connection instance;

    public static synchronized Connection connect() {
        if (postgre == null) {
            try {
                postgre = Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Postgres JDBC driver not found");
            }
        }
        try {
            if (postgre != null && (instance == null || instance.isClosed())) {
                instance = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException e) {
            return null;
        }
        return instance;
    }

    public static void addLog(String event, String fromUser, String toUser, String message) {
        Date dateNow = new Date();
        String query = "INSERT INTO public.\"LOG\" (\"EVENT\", \"USER_FROM\", \"USER_TO\", \"MESSAGE\", \"LOG_TIME\") VALUES ('"
                + event + "','"
                + fromUser + "','"
                + toUser + "','"
                + message + "',"
                + "to_timestamp('" + format.format(dateNow) + "', 'yyyy.MM.dd hh24:mi:ss')"
                + ")";
        try {
            Connection con = connect();
            if (con != null) {
                Statement stmt = con.createStatement();
                if (stmt != null) {
                    stmt.executeQuery(query);
                    stmt.close();
                }
                con.close();
            }
        } catch (SQLException e) {
        }
    }

    public static String AddUser(String myId, String myName, String mySurName, String myPass) {
        String query = "select count(1) from public.\"USER\" where \"LOGIN\" = '" + myId + "'";
        String insert = "INSERT INTO public.\"USER\" (\"NAME\", \"SURNAME\", \"LOGIN\", \"PASSWORD\") VALUES ('"
                + myName + "','"
                + mySurName + "','"
                + myId + "','"
                + myPass + "')";
        String result = new String();
        try {
            Connection con = connect();
            if (con != null) {
                Statement stmt = con.createStatement();
                if (stmt != null) {
                    ResultSet rs = stmt.executeQuery(query);
                    if (rs != null) {
                        if (rs.next()) {
                            if (rs.getString(1).equals("0")) {
                                try {
                                    stmt.execute(insert);
                                    result = "SUCCESS";
                                } catch (SQLException e1) {
                                    result = e1.getMessage();
                                }
                            } else result = "Пользователь " + myId + " уже существует!";
                        }
                        rs.close();
                    }
                    stmt.close();
                }
                con.close();
            }
        } catch (SQLException e) {
            result = e.getMessage();
        }
        return result;
    }

    public static Map<String, String> getUserData(String myId, String tryPass) {
        Map<String, String> result = new HashMap<>();
        String query = "select \"NAME\", \"LOGIN\", \"PASSWORD\" from public.\"USER\" order by \"NAME\"";
        String userName;
        String userId;
        StringBuilder users = new StringBuilder(new String());
        String usersActive;
        Sessions sessions = Sessions.getInstance();
        try {
            Connection con = connect();
            if (con != null) {
                Statement stmt = con.createStatement();
                if (stmt != null) {
                    ResultSet rs = stmt.executeQuery(query);
                    if (rs != null) {
                        while (rs.next()) {
                            userName = rs.getString(1);
                            userId = rs.getString(2);
                            usersActive = "false";
                            for (Map.Entry<String, List<Session>> entry : sessions.getSessions().entrySet()) {
                                if (entry.getKey().equals(userId)) {
                                    List<Session> sessionList = entry.getValue();
                                    if (sessionList.size() > 0) usersActive = "true";
                                }
                                if (entry.getKey().equals(myId)) result.put("CONNECT", "TRUE");
                            }
                            users.append("{\"name\":\"").append(userName).append("\",\"id\":\"").append(userId).append("\",active:").append(usersActive).append("},");
                            if (tryPass != null && userId != null && userId.equals(myId) && tryPass.equals(rs.getString(3)))
                                result.put("myName", userName);
                        }
                        users = new StringBuilder(users.substring(0, users.length() - 1));
                        result.put("users", users.toString());
                        rs.close();
                    }
                    stmt.close();
                }
                con.close();
            }
        } catch (SQLException e) {
            result.put("error", e.getMessage());
        }
        return result;
    }

}
