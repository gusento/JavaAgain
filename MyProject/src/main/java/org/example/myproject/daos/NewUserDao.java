package org.example.myproject.daos;

import org.example.myproject.beans.Usuarios;

import java.sql.*;

public class NewUserDao {
    public void createUser(String nombre,String apellido, String telefono, String correo, String usuario, String password){
        int idlast=0;
        try {
            String user = "root";
            String pass = "root";
            String url = "jdbc:mysql://localhost:3306/myapp?serverTimezone=America/Lima";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,pass);
            String query = "Insert into usuarios (nombre,apellido,telefono,correo) values (?,?,?,?)";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setString(3, telefono);
                ps.setString(4, correo);
                ps.executeUpdate();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select last_insert_id()");
                if (rs.next()) {
                    idlast = rs.getInt(1);
                    System.out.println("last id dentro: "+idlast);
                }
                String query2 = "Insert into credentials (usuario,password,idusuarios) values (?,?,?)";
                try (PreparedStatement ps2 = conn.prepareStatement(query2)) {
                    ps2.setString(1, usuario);
                    ps2.setString(2, password);
                    System.out.println("id last try: "+idlast);
                    ps2.setInt(3,idlast);
                    ps2.executeUpdate();
                }
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }



}
