<%-- 
    Document   : consultarUsuario
    Created on : 20/06/2020, 01:08:25 PM
    Author     : User
--%>

<%@page import="Controller.UsuarioDao.EliminarUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page errorPage="error.jsp"%>

<%!
//Se Declaran variables para la conexion y pagina
    enum Estados {
        FORMULARIO, RESPUESTA, MENSAJE
    };
    private String USERNAME ="root";
    private String PASSWORD ="";
    private String HOST ="localhost";
    private String PORT="3306";
    private String DATABASE ="Caterpillar?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private String CLASSNAME="com.mysql.cj.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
%>



<%    Estados estado1 = Estados.FORMULARIO;
    String documento = null;
    String nombres = null;
    String apellidos = null;
    String correo = null;
    String contraseña = null;
    String tipoDoc = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    String query = "select * from usuario where numero_Documento=?";

//Conexion a la Base de Datos
    if (con == null) {
        Class.forName(CLASSNAME).newInstance();
        con= DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

//Procesar Consulta
    if (request.getParameter("Ndocumento") != null) {

        documento = request.getParameter("Ndocumento");
        ps = con.prepareStatement(query);
        ps.setString(1, documento);
        rs = ps.executeQuery();
        if (rs.next()) {
            estado1 = Estados.RESPUESTA;
            nombres = rs.getString("nombres");
            apellidos = rs.getString("apellidos");
            correo = rs.getString("correo");
            contraseña = rs.getString("contrasenia");
            tipoDoc = rs.getString("tipo_documento_id");
        } else {
            estado1 = Estados.MENSAJE;

        }
        rs.close();
        ps.close();

    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Usuario</title>

    </head>
    <body>
        <link href="css/Styleconsultas.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link href="font/fontello.css" rel="stylesheet" type="text/css"/>
       
        <link rel="icon" href="Imagenes/logo sena.png" >

        <% if (estado1 == Estados.FORMULARIO) {%> 
        <nav>
            <div class="table-responsive">
            <div id="consul" class="col-lg-4">
                <h1>Consultas</h1>

                <form name="form1" class="form-box" method="post" action="consultarUsuario.jsp">
                   
                    <input name="Ndocumento" type="text" placeholder="Documento" class="form-control">
                    <br>
                    <input id="consultar" class="btn btn-primary" value="Consultar" type="submit" >
                    <a href="menuAdministrador.jsp" class="btn btn-success" type="button" >Volver</a>

                </form>
                </div>
            </div>
        </nav>

        <%} else if (estado1 == Estados.RESPUESTA) {%>
        <nav>
            <div class="container">
                <br>
                <h1>Usuario</h1>
                <div class="table-responsive">
                    <a href="consultarUsuario.jsp" style="" class="btn btn-success" type="button" >Volver</a>
                    <br>
                    <br>
                    <table  class="table table-sm table-bordered table-hover ">
                        <thead class="thead-dark">
                            <Tr>
                                <th class="text-center" > Documento</th>
                                <th class="text-center"> Nombres</th>
                                <th  class="text-center"> Apellidos</th>
                                <th class="text-center"> Correo</th>
                                <th class="text-center"> Contrasenia</th>
                                <th class="text-center"> Tipo De Documento</th>
                              



                            </Tr>    

                        <td class="text-center" ><%=documento%></td>
                        <td class="text-center"><%=nombres%></td>
                        <td class="text-center" ><%=apellidos%></td>
                        <td class="text-center" ><%=correo%></td>
                        <td class="text-center" ><%=contraseña%></td>
                        <td class="text-center" ><%=tipoDoc%></td>
                        <td class="text-center" > 
                            <a  style="color: white" href="actualizarUsuario.jsp?cod=<%=documento%>"  name="btnconsultar" class="btn btn-info" type="button" >Actualizar</a> 

                            <br>

                            <a style="color: white" href="eliminarUsuario.jsp?cod=<%=documento%>" name="btneliminar" class="btn btn-danger" type="button"  value="Consultar">Eliminar</a>

                        </td>

                        </thead>
                    </table>
                </div>
            </div>
        </nav>
        <% } else {%>

    <center><img  class="error"src="img/error.jpg" alt=""/></center>

    <center><a class="a">ERROR El USUARIO NO EXISTE</a></center>

    <br>
    <center><p> <a class="enlace" href="consultarUsuario.jsp"> Retornar</a></p></center>

    <% }%>
</body>
</html>
