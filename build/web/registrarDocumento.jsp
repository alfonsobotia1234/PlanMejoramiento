<%-- 
    Document   : registrarDocumento
    Created on : 20/06/2020, 09:48:58 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Documento</title>
    </head>

    <link href="font/fontello.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="css/styleregistrodoc.css" rel="stylesheet" type="text/css"/>
    
    <body>
    <nav>
        <h1 >Registro de Tipo de Documento</h1>
    <div class="input-group-prepend" >
        <form class="form" action="RegistrarDocumento" >
            <br>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                </div>
                <input name="inicial" type="text" maxlength="4" placeholder="Inicial del documento" class="form__input" /><br>
            </div><br>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                </div>
                <input name="nombreDocumento" type="text" placeholder="Nombre de Documento" class="form__input" /><br>
            </div><br>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="inputGroupSelect01"><i class="icon-down-open"></i></label>
                </div>
                <select name="estadoTipoDoc" class="custom-select">  <br>
                    <option>Selelccione una opcion</option> 
                    <option value="Activo">Activo</option> 
                    <option value="Inactivo">Inactivo</option> 

                </select> 
            </div> <br>

            <input class="btn btn-primary" name="accion" value="Agregar" type="submit">
            <a style="color: white" href="menuAdministrador.jsp" class="btn btn-success" type="submit">Volver</a>


        </form>
    </div>
</nav>
</body>
</html>