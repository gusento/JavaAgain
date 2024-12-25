package org.example.myproject.daos;

import org.example.myproject.beans.Usuarios;

import java.sql.*;
import java.util.ArrayList;

public class UsuariosDao {
    public ArrayList<Usuarios> getUsuarios() {
        ArrayList<Usuarios> usuarios = new ArrayList<>();
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Lima";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from usuarios");
            while (rs.next()) {
                Usuarios u = new Usuarios();
                u.setIdusuarios(rs.getInt("idusuarios"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setCorreo(rs.getString("correo"));
                u.setTelefono(rs.getString("telefono"));
                usuarios.add(u);
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return usuarios;
    }
}
