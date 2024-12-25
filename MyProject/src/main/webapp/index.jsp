<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <!-- Incluye el CSS de Bootstrap -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {
      background-color: #121212;
      color: white;
    }
    .card {
      background-color: #333333;
      border: none;
    }
    .card-header, .card-footer {
      background-color: #444444;
    }
    .btn-primary {
      background-color: #007bff;
      border-color: #007bff;
    }
    .btn-primary:hover {
      background-color: #0056b3;
      border-color: #0056b3;
    }
    .form-control {
      background-color: #555555;
      border: 1px solid #666666;
      color: white;
    }
    .form-control:focus {
      background-color: #555555;
      border-color: #007bff;
      color: white;
    }
  </style>
</head>
<body>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-header text-center">
          <h4>Iniciar sesión</h4>
        </div>
        <div class="card-body">
          <form method="POST" action="<%=request.getContextPath()%>/Login">
            <div class="form-group">
              <label for="usuario">Usuario</label>
              <input type="text" class="form-control" id="usuario" name="usuario" placeholder="Ingresa tu usuario">
            </div>
            <div class="form-group">
              <label for="password">Contraseña</label>
              <input type="password" class="form-control" id="password" name="password" placeholder="Ingresa tu contraseña">
            </div>
            <button type="submit" class="btn btn-primary btn-block">Iniciar sesión</button>
          </form>
        </div>
        <div class="card-footer text-center">
          <a href="<%= request.getContextPath()%>/Register" style="color: #007bff;">¿No tienes una cuenta? Regístrate aquí</a>
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


