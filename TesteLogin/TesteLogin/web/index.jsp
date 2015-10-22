<%-- 
    Document   : index
    Created on : 29/09/2015, 09:22:22
    Author     : 1147106
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teste LOGIN</title>
    </head>
    <body>
        <h1>LOGIN</h1>
        <form action="FrontController" method="POST">
            <input type="hidden" name="command" value="usuario.login"/>
            <p>Nome: <input type="text" name="username" required/> * </p>
            <p>Senha: <input type="password" name="password" required/> * </p>
            <p><input type="submit" value="LOGIN"/></p>
        </form>
    </body>
</html>
