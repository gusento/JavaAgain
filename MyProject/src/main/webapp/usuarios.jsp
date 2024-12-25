<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.myproject.beans.Usuarios"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.example.myproject.beans.Credentials" %>
<%
  ArrayList<Usuarios> usuarios = (ArrayList<Usuarios>) request.getAttribute("usuarios");
%>
<% String userlog = (String) request.getAttribute("usuariolog"); %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
        rel="stylesheet" crossorigin="anonymous">
    <title>Lista usuarios</title>
</head>
<body>
<div class='container' >
  <h1 class='mb-3'>Usuarios de myapp</h1>
  <h2>Bienvenido <%= userlog%></h2>
  <table>
    <tr>
      <th> #</th>
      <th> Nombre</th>
      <th> Apellido</th>
      <th> Telefono</th>
      <th> Correo</th>
    </tr>
    <% int i =1;%>
    <% for (Usuarios user : usuarios) { %>
    <tr>
      <td> <%=i%></td>
      <td> <%=user.getNombre() %></td>
      <td> <%=user.getApellido() %></td>
      <td> <%=user.getTelefono() %></td>
      <td> <%=user.getCorreo() %></td>
    </tr>
    <% i++;} %>
  </table>
</div>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
