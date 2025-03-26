package com.uniquedveloper.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("name");
        String uemail = request.getParameter("email");
        String upwd = request.getParameter("pass");
        String re_pass = request.getParameter("re_pass");
        String umobile = request.getParameter("contact");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (!upwd.equals(re_pass)) {
            out.println("<div class='alert alert-danger'>❌ Les mots de passe ne correspondent pas !</div>");
            return;
        }

        Connection con = null;
        PreparedStatement checkUser = null;
        PreparedStatement insertUser = null;
        ResultSet resultSet = null;

        try {
            // Connexion à la base de données
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube?useSSL=false", "root", "Ngonemoussa12");

            // Vérifier si l'email est déjà utilisé
            checkUser = con.prepareStatement("SELECT COUNT(*) FROM users WHERE uemail = ?");
            checkUser.setString(1, uemail);
            resultSet = checkUser.executeQuery();
            resultSet.next();

            if (resultSet.getInt(1) > 0) {
                out.println("<div class='alert alert-warning'>⚠️ Cet email est déjà enregistré !</div>");
                return;
            }

            // Insérer l'utilisateur dans la base de données
            insertUser = con.prepareStatement("INSERT INTO users (uname, upwd, uemail, umobile) VALUES (?, ?, ?, ?)");
            insertUser.setString(1, uname);
            insertUser.setString(2, upwd);
            insertUser.setString(3, uemail);
            insertUser.setString(4, umobile);

            int rowCount = insertUser.executeUpdate();

            if (rowCount > 0) {
                out.println("<div class='alert alert-success'>✅ Compte créé avec succès ! Redirection...</div>");
                out.println("<script>setTimeout(() => window.location.href='login.jsp', 2000);</script>");
            } else {
                out.println("<div class='alert alert-danger'>❌ Échec de l'inscription. Veuillez réessayer !</div>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<div class='alert alert-danger'>❌ Erreur interne du serveur : " + e.getMessage() + "</div>");
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (checkUser != null) checkUser.close();
                if (insertUser != null) insertUser.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}