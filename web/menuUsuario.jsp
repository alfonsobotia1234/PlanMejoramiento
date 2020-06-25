
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="Model.Conexion"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.lang.String"%>
<%@include file="seguridad.jsp" %>
<%HttpSession ob = request.getSession();%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Jekyll v4.0.1">
        <title>Carousel Template · Bootstrap</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/carousel/">

        <!-- Bootstrap core CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <link rel="icon" href="imagenes/C10000554.jpeg" >
        <style>
            img {
                width: 170px;
                height: 170px;
                border-radius: 40px;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <!-- Custom styles for this template -->
        <link href="css/carousel.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
           
            <nav class="navbar navbar-expand-md navbar-dark fixed-top ">
                <a class="navbar-brand" href="menuUsuario.jsp">Caterpillar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" >
                    <ul class="navbar-nav mr-auto">


                        <li class="nav-item active">
                            <a class="nav-link" href="consultarUsuario.jsp">Actualizar Datos personales</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="contactarVendedor.jsp">Contactar vendedor </a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="#"><i class="fas fa-cart-plus">(<label style="color: ">${contador}</label>)</i> Carrito de compras</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="Salir.jsp">Cerrar Sesión</a>
                        </li>
                    </ul>
                    <form class="form-inline mt-2 mt-md-0">
                        <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search">
                        <button class="btn btn btn-outline-warning my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </nav>
        </header>

        <main role="main">

            <div id="myCarousel" class="carousel slide" data-ride="carousel">
            </div>
            <%  Conexion con = new Conexion();
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    String consulta = "SELECT * FROM producto;";
                    pst = con.getConexion().prepareStatement(consulta);
                    rs = pst.executeQuery();

                    while (rs.next()) {
            %>
            <!--este es el espacio de los productos-->
            <div class="container marketing">
                <div class="row">
                    <div class="col-lg-4">
                        <div class="card">
                            <div class="card-header">
                                <img src="ControladorImagen?id=<%=rs.getString("id_producto")%>"
                                     <br>
                                
                                <h2><%=rs.getString("nombre_producto")%></h2>
                                <i><%=rs.getString("precio")%><i>
                                        
                                        <div>
                                            <p><a class="btn btn-warning" href="Controlador?accion=AgregarCarrito=${p.getId()}" role="button">Agregar al Carrito</a></p>
                                            <p><a class="btn btn-warning" href="" role="button">Alquilar</a></p>


                                        </div>

                                        </div>

                                        </div><!-- /.col-lg-4 -->

                                        </div>
                                        </div>
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
                                                    if (rs != null) {
                                                        rs.close();
                                                    }

                                                } catch (SQLException e) {
                                                    System.err.println("Error" + e);
                                                }
                                            }


                                        %>
                                        </div>
                                        </main>
                                        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                                        <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="../assets/dist/js/bootstrap.bundle.js"></script>
                                        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
                                        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
                                        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

                                        </html>

