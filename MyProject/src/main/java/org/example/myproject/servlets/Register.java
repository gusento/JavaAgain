package org.example.myproject.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.myproject.daos.AsignCredentialsDao;
import org.example.myproject.daos.NewUserDao;

import java.io.IOException;

@WebServlet(name="Register", urlPatterns={"/Register"})
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("register.jsp");
        view.forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        NewUserDao newUserDao = new NewUserDao();
        AsignCredentialsDao asignCredentialsDao = new AsignCredentialsDao();
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String usuario = request.getParameter("usuario");
        String password =request.getParameter("password");

        newUserDao.createUser(nombre,apellido,telefono,correo,usuario,password);
        response.sendRedirect(request.getContextPath()+"/Login");
    }
}
