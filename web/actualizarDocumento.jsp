<%-- 
    Document   : actualizarDocumento
    Created on : 20/06/2020, 06:24:18 PM
    Author     : User
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Model.Conexion"%>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Actualizar</title>
</head>
<body>
    <link href="css/styleregistraruser.css" rel="stylesheet" type="text/css"/>

<center> <h1 class="user__title">Actualizar Tipo de documento</h1></center>
    <div class="user" >
    <%
        String inicial = request.getParameter("codigo");
            Conexion con = new Conexion();
            PreparedStatement pst = null;
            ResultSet rs = null;
            try {   
                String consulta = "SELECT * FROM tipo_documento where id_tipo_documento= ?;";
                pst = con.getConexion().prepareStatement(consulta);
                pst.setString(1, inicial);
                rs = pst.executeQuery();

                while (rs.next()) { %>

       
      <form class="form" action="ActualizarDocumento" method="post">

        <div class="form__group">
            <input name="id" readonly type="text" value="<%=rs.getString(1)%>" placeholder="Codigo de Dependencia" class="form__input" />
            <input name="inicial" type="text" value="<%=rs.getString(2)%>" placeholder="Codigo de Dependencia" class="form__input" />
        </div>
      
            <br>
        
        <div class="form__group">
            <input name="nombreDocumento" type="text" value="<%=rs.getString(3)%>" placeholder="Nombre" class="form__input" />
        </div>
          <%}%>  
        <br>
        
        <div class="form__group">
            <select name="estadoTipoDocumento" class="form__input">  <br>
                <option>Tipo de documento</option> 
                <option value="Activo">Activo</option> 
                <option value="Inactivo">Inactivo</option> 

            </select> 
        </div> <br>
        
        
        <center><input class="boton" name="opcion" value="Guardar" type="submit">  

        </center>
    </form>
</div>
</body>
</html>
<%

    }catch (SQLException e) {
        System.out.println("Error" + e);
    } finally {
        try {
            if (con.getConexion() != null) {
                con.getConexion().close();
            }
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            System.err.println("Error" + e);
        }
    }
%>





