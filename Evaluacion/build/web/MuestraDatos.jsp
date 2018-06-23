<%-- 
    Document   : MuestraDatos
    Created on : 22/06/2018, 08:11:18 PM
    Author     : Jorge Ramirez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <%@page import="co.evalucacion.modelo.Empleado" %>
        <% Empleado emple = (Empleado) request.getAttribute("atribEmple");%>
        
            <table cellspacing="4" cellpadding="4" border="1">
                <tr>
                    <td aling="right">NoDocumento</td>
                    <td><%=emple.getNoDocumento() %></td>
                </tr>
                <tr>
                    <td aling="right">Tipo de Documento</td>
                    <td><%=emple.getTipoDocumento()%></td>
                </tr>
                <tr>
                    <td aling="right">Nombre</td>
                    <td><%=emple.getNombre()%></td>
                </tr>
                <tr>
                    <td aling="right">Sueldo</td>
                    <td><%=emple.getSueldo()%></td>
                </tr>
                <tr>
                    <td aling="right">su descuento es</td>
                    <td><%=emple.getDescuento()%></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
