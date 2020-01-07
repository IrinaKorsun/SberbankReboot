package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class ChatServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String myId = request.getParameter("login").toUpperCase();
        Map<String, String> data = DBController.getUserData(myId, request.getParameter("password"));
        String myName = data.get("myName");
        if (myName == null) {
            out.write("<script>alert('Неправильный пароль или имя пользователя!');</script>\n");
            request.getRequestDispatcher("index.jsp").include(request, response);
        } else if ("TRUE".equals(data.get("CONNECT"))) {
            out.write("<script>alert('Пользователь " + myName + " уже находится в чате!');</script>\n");
            request.getRequestDispatcher("index.jsp").include(request, response);
        } else {
            response.setHeader("Cache-Control", "no-cache");
            out.write("<html>\n");
            out.write("<script type=\"text/javascript\">\n");
            out.write("var yourKey = '" + myId + "';\n");
            out.write("var yourName = '" + myName + "';\n");
            out.write("var AllUsers = new Array (" + data.get("users") + ");\n");
            out.write("</script>\n");
            request.getRequestDispatcher("main.jsp").include(request, response);
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write("<h3>" + "This a chat! (GET)" + "</h3>");
    }
}
