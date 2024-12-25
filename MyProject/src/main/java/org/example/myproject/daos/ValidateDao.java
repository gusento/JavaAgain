package org.example.myproject.daos;

import org.example.myproject.beans.Credentials;
import org.example.myproject.beans.Usuarios;

import java.sql.*;

public class ValidateDao {
    public boolean validate(String usuario, String password) {
        Credentials cred = new Credentials();
        boolean access = false;
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Lima";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from credentials");
            while (rs.next()) {
                if(rs.getString("usuario").equals(usuario) && rs.getString("password").equals(password)) {
                    access = true;
                    break;
                }
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return access;
    }
}
