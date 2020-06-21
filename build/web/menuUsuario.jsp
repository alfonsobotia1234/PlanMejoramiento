<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Model.Conexion"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.lang.String"%>
<%HttpSession ob = request.getSession();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
        <link rel="icon" href="Imagenes/logo sena.png" >
    </head>
    <body>

        <link rel="stylesheet" href="font/fontello.css">
        <link href="css/styleresponsable.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

        <header>
            <input type="checkbox" id="btn-menu">
            <label for="btn-menu" class="icon-menu"></label>
            <a href="menuUsuario.jsp"><img  src="Imagenes/" alt=""></a>
            
            <nav class="menu">
                <a id="usr"><span class="icon-user"></span>Usuario : <% out.print(ob.getAttribute("nombre"));%></a>

                <ul>
                 <li><a class="icon-help" href="manualUsuario/manual.docx" download="Manual.docx">Ayuda</a>  
                    </li>

                    <li><a class="icon-logout" href="Salir.jsp">Salir</a>  
                    </li>
                </ul>

            </nav>
        </header>
        <script src="jquery/menuadmin.js"></script>
    </body>
</html>