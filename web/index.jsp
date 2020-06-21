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
        <title>Login</title>
        <link rel="stylesheet" href="css/stylelogin.css">
        <link rel="stylesheet" href="font/fontello.css">
        <link rel="icon" href="Imagenes/" >

    </head>
    <body>
        <img src="Imagenes/">
        <form action="Iniciar" method="post" class="login-box">

            <h1>Login</h1>
            <div class="textbox">
                <i class="icon-user"></i>
                <input name="usuario" type="text" placeholder="Documento">
            </div>

            <div class="textbox">
                <i class="icon-key"></i>

                <input name="contrasenia" type="password" placeholder="Contraseña">
            </div>

            <input type="submit" class="btn" value="Ingresar">
        </form>
        <br>
        No tienes una cuenta....<a href="registrarUsuario.jsp"> Registrate</a>
    </body>
</html>