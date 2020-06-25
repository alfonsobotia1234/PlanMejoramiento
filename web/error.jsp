<%-- 
    Document   : error
    Created on : 20/06/2020, 01:40:57 PM
    Author     : User
--%>
<%@include file="seguridad.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Aprendices</title>
    </head>
    <body>
        <h1>Sena CEET</h1>
         <h2>Error</h2>
         <p class="error"><%=exception.getMessage()%></p>
         <p><a href="consultarUsuario.jsp">Retornar</a></p>
    </body>
</html>
