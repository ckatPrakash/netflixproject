package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String emailOrUsername = request.getParameter("emailOrUsername");
        String password = request.getParameter("password");

        // Log the submitted data (for demonstration purposes)
        System.out.println("Email/Username: " + emailOrUsername);
        System.out.println("Password: " + password);

        // Redirect to a success page or back to the login page
        response.sendRedirect("login.jsp");
    }
}