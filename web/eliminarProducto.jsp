<%-- 
    Document   : eliminarProducto
    Created on : 23/06/2020, 08:32:54 PM
    Author     : User
--%>
<%@include file="seguridad.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto</title>
    </head>
    <body>
        <link href="css/Styleconsultas.css" rel="stylesheet" type="text/css"/>
        <center> <h1 class="user__title"  >Eliminar Producto</h1></center>
    <form name="form1" method="post" action="EliminarProducto">
        <center> <table  width="354">
                <tr>
                    <td width="84" >
                <center>
                    <div class="user" >
                        <form class="form"  >
                            <div class="form__group">

                                <input name="NombreProducto" type="text" class="form__input" id="codigo"  placeholder="Digite el nombre del producto" required>
                            </div>
                        </form>
                    </div>

                    </td><br>

                    </tr>

                    <center><td width="124"   >
                        <center><button name="btnconsultar" class="boton" type="submit" id="consultar" value="Consultar">Eliminar</button>

                            </td></center>
                        </table>
                    </center
                    </form>
        
        
    </body>
</html>
