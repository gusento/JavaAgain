package org.example.myproject.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.myproject.beans.Usuarios;
import org.example.myproject.daos.UsuariosDao;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="Servlet", urlPatterns={"/users"})
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UsuariosDao usuariosDao = new UsuariosDao();
        ArrayList<Usuarios> usuarios = usuariosDao.getUsuarios();
        String user = request.getParameter("usuario");
        request.setAttribute("usuariolog", user);
        request.setAttribute("usuarios", usuarios);
        RequestDispatcher view = request.getRequestDispatcher("usuarios.jsp");
        view.forward(request,response);



    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
