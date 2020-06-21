<%-- 
    Document   : registrarUsuario1
    Created on : 20/06/2020, 12:49:18 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>

    <nav>
            <h1 class="user__title">Registro</h1>
            <br>
            <div  class="input-group-prepend">
                <form class="form" action="usuario" method="post">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="documento" type="text" placeholder="Número de Documento"  class="form-control" />
                    </div>
                  
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="nombres" type="text" placeholder="Nombres" class="form-control" />
                    </div>
                  
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="apellidos" type="text" placeholder="Apellidos" class="form-control" />
                    </div>
                   
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="correo" type="email" placeholder="Correo" class="form-control" />
                    </div>
                   
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                           <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="contrasenia" type="password" placeholder="Contraseña" class="form-control" />
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01"><i class="icon-down-open"></i></label>
                        </div>
                        
                        <select name="tipodoc"  class="custom-select"  >  <br>
                            <option >Tipo de documento</option> 
                            <option value="3">Cedula de ciudadania</option> 
                            <option value="5">Cedula de extranjeria</option> 
                            <option value="6">Documento nacioal de identidad</option>
                            <option value="7">Tarjeta de identidad</option> 
                            <option value="8">Tarjeta pasaporte</option> 

                        </select> 
                    </div>


                    <button class="btn btn-primary" type="submit">Registrar</button> 
                    <a class="btn btn-success" type="submit" href="index.jsp" >Volver </a>
                </form>

            </div>
        </nav>
    </body>
</html>
