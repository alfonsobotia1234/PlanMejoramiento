<%-- 
    Document   : menuAdministrador
    Created on : 19/06/2020, 09:42:28 PM
    Author     : User
--%>
<%@include file="seguridad.jsp" %>
<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <a class="navbar-brand" href="menuAdministrador.jsp">Caterpillar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" >
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Registro
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="registrarUsuario.jsp">Usuario</a>
                                <a class="dropdown-item" href="registrarDocumento.jsp">Tipo de documento</a>
                                <a class="dropdown-item" href="agregar.jsp">Agregar nuevo producto</a>
                            </div>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Consultar
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="consultarUsuario.jsp">Usuario</a>
                                <a class="dropdown-item" href="consultarDocumento.jsp">Tipo de documento</a>
                                <a class="dropdown-item" href="consultarProducto.jsp">Producto</a>

                            </div>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="menuUsuario.jsp">Menu Usuario</a>
                        </li>

                        <li class="nav-item active">
                            <a class="nav-link" href="Salir.jsp">Cerrar Sesión</a>
                        </li>

                    </ul>

                </div>
            </nav>
        </header>

        
        <div class="container my-5">
          
            <div class="bd-example">
  <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
      <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <div class="carousel-item active">
         <img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar">
        <div class="carousel-caption d-none d-md-block">
          <h5>First slide label</h5>
          <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
        </div>
      </div>
      <div class="carousel-item">
    <img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar">
        <div class="carousel-caption d-none d-md-block">
          <h5>Second slide label</h5>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
      </div>
      <div class="carousel-item">
         <img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar">
        <div class="carousel-caption d-none d-md-block">
          <h5>Third slide label</h5>
          <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
            
            col-xs-12 col-md-4
            <div class="row">
                <div class="col">
                    <a href="registrarUsuario.jsp" ><img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar"></a>
                
            </div>            
            
              <div class="col">
                    <a href="registrarUsuario.jsp" ><img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar"></a>
                
            </div>           <div class="col">
                    <a href="registrarUsuario.jsp" ><img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar"></a>
                
            </div>           <div class="col">
                    <a href="registrarUsuario.jsp" ><img src="imagenes/Caterpillar-shortened.svg.png" class="d-block w-100" alt="eeror cargar"></a>
                
            </div>         
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="../assets/dist/js/bootstrap.bundle.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

        
       </body>    
</html>
