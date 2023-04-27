<%-- 
    Document   : index
    Created on : 27 de abr. de 2023, 09:42:18
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game</title>
        <link ref="stylesheet" href="css/style.css"/>
        <link rel="icon" href="img/logotipo.jpg"/>
    </head>
    <body>
        <form action="login_controller">
            <img src="img/logotipo.jpg" alt="Logotipo do site"/>
            <br>
            <input type="text" name="user" id="user" class="fields" placeholder="Nome de usuário" required="">
            <br><br>
            
            <input type="password" name="pass" id="pass" class="fields" placeholder="Senha" required="">
            <br><br>
            
            <input type="submit" value="Entrar">
        </form>
    </body>
</html>
