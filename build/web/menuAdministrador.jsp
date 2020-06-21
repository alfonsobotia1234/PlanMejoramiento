<%-- 
    Document   : menuAdministrador
    Created on : 19/06/2020, 09:42:28 PM
    Author     : User
--%>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HttpSession ob = request.getSession();%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Administrador</title>

    </head>
    <link rel="stylesheet" href="font/fontello.css">
    <link rel="stylesheet" href="css/styleadmin.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
   <link rel="icon" href="Imagenes/logo sena.png" >
   
    <body>
        <header>
            <input type="checkbox" id="btn-menu">
            <label for="btn-menu" class="icon-menu"></label>
            <a href="menuAdmin.jsp"><img  src="Imagenes/" alt=""></a>
            <nav class="menu">
                <a id="usr"><span class="icon-user"></span>Usuario : <% out.print(ob.getAttribute("nombre"));%></a>
                <ul> 

                    <li class="submenu"><a class="icon-user-plus" href="#">Registrar<span class="icon-down-open"></span></a>
                        <ul>
                            <li><a class="icon-user-plus" href="registrarUsuario.jsp">Usuario</a></li>
                            
                            <li><a class="icon-user-plus" href="registrarDocumento.jsp">Tipo de documento</a></li>
                        </ul>
                    </li>
                    <li class="submenu"><a class="icon-search" href="#">Consultar<span class="icon-down-open"></span> </a> <ul>
                            <li><a class="icon-search" href="consultarUsuario.jsp">Usuario</a></li>
                            
                            <li><a class="icon-search" href="consultarDocumento.jsp">Tipo de documento</a></li>
                        </ul>
                    </li>
                  
                    <li><a class="icon-help" href="manualUsuario/manual.docx" download="Manual.docx">Ayuda</a>  
                    </li>
                    </li>
                    <li><a class="icon-logout" href="Salir.jsp">Salir</a>  
                    </li>
                </ul>

            </nav>
        </header>
        <script src="jquery/menuadmin.js"></script>
    </body>

</html>
