package app.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write("<h1>" + "hello" + "</h1>");
        /*PrintWriter out = response.getWriter();
        try {
            request.getRequestDispatcher("index.jsp").include(request, response);
        } catch (ServletException Ex) {}
        out.close();*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.setHeader("Cache-Control", "no-cache");
        response.setCharacterEncoding("utf-8");
        //response.getWriter().write("<h1>" + "hello" + "</h1>");
        //PrintWriter out = response.getWriter();
        try {
            request.getRequestDispatcher("registration.jsp").include(request, response);
        } catch (ServletException Ex) {}
        //out.close();
    }

}
