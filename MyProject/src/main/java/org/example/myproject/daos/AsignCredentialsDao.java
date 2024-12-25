package org.example.myproject.daos;

import java.sql.*;

public class AsignCredentialsDao {
    public void credenciales(String usuario,String password){
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Lima";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            String query = "Insert into credentials (usuario,password,idusuarios) values (?,?,LAST_INSERT_ID())";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, usuario);
                ps.setString(2, password);
                ps.executeUpdate();
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
