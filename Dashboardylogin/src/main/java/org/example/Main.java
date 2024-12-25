package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Lima";
        try {
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from credentials");
            while (rs.next()) {
                int id = rs.getInt("id");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                System.out.println("ID: " + id + " | usuario: " + usuario
                        + " | password: " + password);
            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

}