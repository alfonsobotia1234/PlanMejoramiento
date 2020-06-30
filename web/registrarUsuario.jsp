<%-- 
    Document   : registrarUsuario1
    Created on : 20/06/2020, 12:49:18 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>Checkout example · Bootstrap</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/checkout/">
    <link rel="icon" href="imagenes/C10000554.jpeg" >
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="css/form-validation.css" rel="stylesheet">
  </head>
  <body class="bg-light">
    <div class="container">
  <div class="py-5 text-center">
    <img class="d-block mx-auto mb-4" src="imagenes/Caterpillar-shortened.svg.png" alt="" width="72" height="72">
    <h2>Caterpillar</h2>
  </div>
  <div class="row justify-content-center ">
    <div class="col-md-8 order-md-1">
      <h4 class="mb-3">Registro</h4>
      <form action="usuario" method="post" class="needs-validation" novalidate>
        <div class="row">
          <div class="col-md-6 mb-3">
            <label for="firstName">Numero de documento</label>
            <input name="documento" type="text" class="form-control" id="firstName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid first name is required.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="firstName">Nombres</label>
            <input name="nombres" type="text" class="form-control" id="firstName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid first name is required.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="firstName">Apellidos</label>
            <input name="apellidos" type="text" class="form-control" id="firstName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid first name is required.
            </div>
          </div>
          <div class="col-md-6 mb-3">
            <label for="lastName">Contraseña</label>
            <input name="contrasenia" type="password" class="form-control" id="lastName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid last name is required.
            </div>
          </div>
        </div>
        <div class="mb-3">
          <label for="email">Email </label>
          <input name="correo" type="email" class="form-control" id="email" placeholder="you@example.com">
          <div class="invalid-feedback">
            Please enter a valid email address for shipping updates.
          </div>
          
        <div class="row">
          <div class="col-md-5 mb-3">
            <label for="country">Tipo de documento</label>
            <select name="tipodoc" class="custom-select d-block w-100" id="country" required>
              <option value="">Seleccionar</option>
                            <option value="3">Cedula de ciudadania</option> 
                            <option value="5">Cedula de extranjeria</option> 
                            <option value="6">Documento nacioal de identidad</option>
                            <option value="14">Tarjeta de identidad</option> 
                            <option value="8">Tarjeta pasaporte</option> 
            </select>
          </div>
            <div class="col-md-6 mb-3"> 
            <label for="firstName"></label>
            <div class="col-md-6 mb-3">
            <input name="rol" type="hidden" class="form-control" id="lastName" placeholder="" value="" required>
            <div class="invalid-feedback">
              Valid last name is required.
            </div>
            </div>
        </div>
        <hr class="mb-4">
        <button class="btn btn-outline-warning btn-lg btn-block" type="submit">Registrar</button>
        <a class="btn btn-outline-warning btn-lg btn-block" href="index.jsp">Volver</a>
      </form>
    </div>
  </div>

  <footer class="my-5 pt-5 text-muted text-center text-small">
  </footer>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
      <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="../assets/dist/js/bootstrap.bundle.js"></script>
        <script src="css/form-validation.js"></script></body>
</html>