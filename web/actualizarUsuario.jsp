<%-- 
    Document   : ActualizarUsuario
    Created on : 19/06/2020, 01:03:43 PM
    Author     : User
--%>

<%@page import="Model.Conexion"%>
<%@page import="Model.Consultas"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
    </head>

    <link href="css/styleregistro.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link href="font/fontello.css" rel="stylesheet" type="text/css"/>
    <body>
        <nav>
            <h1>Actualizar Datos</h1>
   <div class="user" >
            <%

                String numeroDoc = request.getParameter("cod");
                Conexion con = new Conexion();
                PreparedStatement pst = null;
                ResultSet rs = null;
                ResultSet rs2 = null;
                try {   
                    String consulta = ("SELECT * FROM usuario WHERE numero_documento= ?");
                    pst = con.getConexion().prepareStatement(consulta);
                    pst.setString(1, numeroDoc);
                    rs = pst.executeQuery();

                    while (rs.next()) {%>        
      <div  class="input-group-prepend">
                <form class="form" action="Usuario" method="post">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="numeroDoc" type="text" value="<%=rs.getString(2)%>" placeholder="Número de Documento" class="form-control" />
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="nombres" type="text"  placeholder="Nombres" class="form-control" />
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="apellidos" type="text"   placeholder="Apellidos" class="form-control" />
                    </div>
                    <div class="input-group mb-3">

                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="correo" type="email"  placeholder="Correo electronico" class="form-control" />
                    </div>
                    
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01"><i class="icon-down-open"></i></label>
                        </div>
                        <select name="tipoDoc"  class="custom-select"  >  <br>
                            <option >Tipo de documento</option> 
                            <option value="3">Cedula de ciudadania</option> 
                            <option value="5">Cedula de extranjeria</option> 
                            <option value="6">Documento nacional de identidad</option>
                            <option value="14">Tarjeta de identidad</option> 
                            <option value="8">Tarjeta pasaporte</option> 

                        </select> 
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1" ><i class="icon-user-1"></i></span>
                        </div>
                        <input name="id" readonly type="text" value="<%=rs.getString(1)%>" placeholder="UsiarioId" class="form-control" />
                    </div>

                    <button class="btn btn-primary" type="submit">Actualizar</button> 
                    <a class="btn btn-success" type="submit" href="menuUsuario.jsp" >Volver </a>
                </form>
            </div>
        </nav>
    </body>
</html>     




            <%}

                } catch (SQLException e) {
                    System.out.println("Error" + e);
                } finally {
                    try {
                        if (con.getConexion() != null) {
                            con.getConexion().close();
                        }
                        if (pst != null) {
                            pst.close();
                        }

                    } catch (SQLException e) {
                        System.err.println("Error" + e);
                    }
                }


            %>
