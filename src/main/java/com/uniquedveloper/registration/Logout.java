package com.uniquedveloper.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.invalidate();  // Déconnecte l'utilisateur

        // Répond avec un petit message HTML + redirection JavaScript
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<div class='alert alert-success'>Logout successful! Redirecting...</div>");
        response.getWriter().println("<script>setTimeout(() => window.location.href = 'login.jsp', 2000);</script>");
    }
}
