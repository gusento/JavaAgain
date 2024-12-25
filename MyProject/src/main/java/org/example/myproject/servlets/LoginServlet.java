package org.example.myproject.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.myproject.beans.Usuarios;
import org.example.myproject.daos.UsuariosDao;
import org.example.myproject.daos.ValidateDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="LoginServlet", urlPatterns={"","/Login"})
public class LoginServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher view = request.getRequestDispatcher("index.jsp");
        view.forward(request,response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ValidateDao val = new ValidateDao();
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        System.out.println(val.validate(usuario, password));
        if (val.validate(usuario, password)){
            response.sendRedirect(request.getContextPath()+"/users?usuario="+usuario);
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
    }
}
