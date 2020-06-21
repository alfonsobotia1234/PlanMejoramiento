<%-- 
    Document   : Salir
    Created on : 20/06/2020, 12:40:19 PM
    Author     : User
--%>

<%@page session="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession ob = request.getSession();
    ob.setAttribute("usuario", "0");
    ob.setAttribute("nombre", "");
    //ob.setAttribute("documento", "");
    response.sendRedirect("index.jsp");
    

%>