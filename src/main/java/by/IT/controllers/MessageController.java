package by.IT.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "messageController", urlPatterns = "/message")
public class MessageController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
     HttpSession session = req.getSession();
   String sessionMessage = (String) session.getAttribute( "sessionMessage");
   String requestMessage = (String) req.getAttribute( "requestMessage");
   resp.getWriter()
           .append("Session message: " + sessionMessage + "\n")
           .append("Request message: " + requestMessage);
    }
}
