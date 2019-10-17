<%-- 
    Document   : index.jsp
    Created on : 11/10/2019, 01:47:59 PM
    Author     : User88
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculadora con jsp</title>
    </head>
    <body>
        <h1>mi calculadora!</h1>
        <form action="Controlador_Calculadora" method="post">
    <center> 
        <table>
            <tr><td>valor 1</td><td><input type="number" name="Valor1"/></td></tr> 
            <tr><td>valor 2</td><td><input type="number" name="Valor2"/></td></tr>
            <tr><td><input type="submit" name="operacion" value="sumar"/></td>
            <tr><td><input type="submit" name="operacion" value="resar"/></td>
            <tr><td><input type="submit" name="operacion" value="multiplicar"/></td>
            <tr><td><input type="submit" name="operacion" value="dividir"/></td>
            </tr>
        </table>
    </center>
        </form>
    </body>
</html>
