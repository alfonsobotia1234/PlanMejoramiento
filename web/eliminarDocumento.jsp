<%-- 
    Document   : eliminarDocumento
    Created on : 20/06/2020, 10:39:07 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dependencia</title>
    </head>
    <body>
        <link href="css/Styleconsultas.css" rel="stylesheet" type="text/css"/>
        <center> <h1 class="user__title"  >Eliminar Documento</h1></center>
    <form name="form1" method="post" action="EliminarDocumento">
        <center> <table  width="354">
                <tr>
                    <td width="84" >
                <center>
                    <div class="user" >
                        <form class="form"  >
                            <div class="form__group">

                                <input name="inicial" type="text" class="form__input" id="codigo"  placeholder="Digite inicial del Documento" required>
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