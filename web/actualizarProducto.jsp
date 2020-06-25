<%-- 
    Document   : actualizarPorducto
    Created on : 23/06/2020, 09:30:31 PM
    Author     : User
--%>
<%@include file="seguridad.jsp" %>
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

<center> <h1 class="user__title">Actualizar Producto</h1></center>
<div class="user container" >
    <%
        String nombreProducto = request.getParameter("nomProd");
        Conexion con = new Conexion();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT * FROM producto where id_producto= ?;";
            pst = con.getConexion().prepareStatement(consulta);
            pst.setString(1, nombreProducto);
            rs = pst.executeQuery();

            while (rs.next()) {%>


    <form class="form" action="ActualizarProducto" method="post">
        <div class="form__group ">
          
            <input name="nombreProducto" type="text" value="<%=rs.getString(3)%>" placeholder="Nombre del producto" class="form__input" />
        </div>
        <br>
        
        <div class="form__group">
            <input name="precio" type="text" value="<%=rs.getString(4)%>" placeholder="Precio del producto" class="form__input" />
        </div>
        <br>

        <input name="idProducto" readonly type="text" value="<%=rs.getString(1)%>" placeholder="" class="form__input" />
        <br>
        
        <center><input class="boton" name="opcion" value="Guardar" type="submit">  

        </center>
           
    </form>
     <%}%>   
</div>
</body>
</html>

<%

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
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
            System.err.println("Error" + e);
        }
    }
%>
