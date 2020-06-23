<%-- 
    Document   : index
    Created on : 19/06/2020, 12:51:47 PM
    Author     : User
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
    <head>
        <meta charset="utf-8">
        <title>Signin Template · Bootstrap</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="icon" href="imagenes/C10000554.jpeg" >
        <style>
            img {
                width: 180px;
                height: 110px;

            }
            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <!-- Custom styles for this template -->
        <link href="css/signin.css" rel="stylesheet" type="text/css"/>
    </head>
    <body class="text-center">
        <form class="form-signin" action="Iniciar" method="post">
            <img class="mb-4" src="imagenes/Caterpillar-shortened.svg.png" alt="" width="190" height="80"/>

            <h1 class="h3 mb-3 font-weight-normal">Iniciar sesion</h1>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input name="usuario" type="text" id="inputEmail" class="form-control" placeholder="Numero Documento" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input name="contrasenia" type="password" id="inputPassword" class="form-control" placeholder="Contraseña" required>

            <button class="btn btn-lg btn-warning btn-block" value="Ingresar" type="submit">Ingresar</button>
            <p class="mt-5 mb-3 text-muted">No tienes cuenta ----> <a href="registrarUsuario.jsp" style="color: black;">Registrarse</a></p>
        </form>
    </body>
</html>