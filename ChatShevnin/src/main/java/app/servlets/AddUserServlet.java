package app.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("UTF-8");
            String result =  DBController.AddUser(
                    request.getParameter("login").toUpperCase()
                    , request.getParameter("username")
                    , request.getParameter("surname")
                    , request.getParameter("password")
            );
            response.getWriter().write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("Please use method POST");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
