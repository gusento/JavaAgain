
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registro - MyApp</title>
  <!-- Incluye el CSS de Bootstrap -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-header">
          <h4>Crear una cuenta en MyApp</h4>
        </div>
        <div class="card-body">
          <form method="post" action="<%=request.getContextPath()%>/Register">
            <div class="form-group">
              <label for="nombre">Nombre</label>
              <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Ingresa tu nombre">
            </div>
            <div class="form-group">
              <label for="apellido">Apellido</label>
              <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Ingresa tu apellido">
            </div>
            <div class="form-group">
              <label for="telefono">Teléfono</label>
              <input type="text" class="form-control" id="telefono" name="telefono" placeholder="Ingresa tu teléfono">
            </div>
            <div class="form-group">
              <label for="correo">Correo electrónico</label>
              <input type="email" class="form-control" id="correo" name="correo" placeholder="Ingresa tu correo electrónico">
            </div>
            <div class="form-group">
              <label for="usuario">Usuario</label>
              <input type="text" class="form-control" id="usuario" name="usuario" placeholder="Ingresa tu nombre de usuario">
            </div>
            <div class="form-group">
              <label for="password">Contraseña</label>
              <input type="password" class="form-control" id="password" name="password" placeholder="Crea una contraseña">
            </div>
            <button type="submit" class="btn btn-primary btn-block">Registrar</button>
          </form>
        </div>
        <div class="card-footer">
          <a href="<%=request.getContextPath()%>/Login">¿Ya tienes cuenta? Inicia sesión aquí</a>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- Incluye el JS de Bootstrap -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
