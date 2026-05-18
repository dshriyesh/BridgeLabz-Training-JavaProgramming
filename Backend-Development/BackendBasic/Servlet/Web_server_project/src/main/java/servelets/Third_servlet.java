package servelets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class Third_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Processing request by third servlet");

        resp.setContentType("text/html");

        resp.getWriter().println(
                "<h1>GET Request Processed</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("Servlet started at POST method");
        
        String message = req.getParameter("message");
        System.out.println("message: "+message);

        resp.setContentType("text/html");

        resp.getWriter().println(
                "<h1>POST Request Processed</h1>");
    }
}