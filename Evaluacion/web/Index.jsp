<%-- 
    Document   : Index
    Created on : 22/06/2018, 08:04:52 PM
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
        <%@page import="co.evaluacion.controlador.MuestraRegistro" %>
        <form action="MuestraRegistro" method="post">
            
            <h1> INGRESA LOS DATOS</h1>
            <table cellspacing="4" cellpadding="4" border="1">
                <tr>
                    <td>Ingrese Numero de documento</td>
                    <td><input type="number" name="documento" ></input></td>
                </tr>
                <tr>
                    <td>Ingrese el Tipo de documento</td>
                    <td> <select name="tipo" type="text" >
                        <option value="Cedula">Cedula</option>
                        <option value="Tarjeta de identidad">Tarjeta de identidad</option>
                    </select></td>
                </tr>
                <tr>
                    <td>Ingrese su nombre</td>
                    <td><input type="text" name="nombre" ></input></td>
                </tr>
                <tr>
                    <td>Ingrese su Sueldo</td>
                    <td><input type="number" step="any" name="sueldo" ></input></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enviar y Guardar" ></input></td>
                </tr>
            </table>
        </form>
    </center>
    </body>
</html>
