package app.servlets.chat;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/send")
public class SendEndpointServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        ExEndpointWebSocket.send(request.getParameter("msg"), request.getParameter("key"), request.getParameter("sender"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println(ExEndpointWebSocket.getKeys().toString());
    }
}
