<%-- 
    Document   : Seguridad
    Created on : 24/06/2020, 03:38:31 PM
    Author     : User
--%>

<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

HttpSession obj = request.getSession();

 if (obj.getAttribute("usuario") != "1") {
        response.sendRedirect("index.jsp");
    }



%>
