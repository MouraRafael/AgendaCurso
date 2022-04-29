<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
    <form action="LoginServlet" method="post">
        <input type="text" name="login" placeholder="Insira o nome de usuário" required>
        <input type="password" name="senha" placeholder="Insira a senha" required>
        <input type="submit" value="entrar">
    </form>
    <% if (request.getAttribute("erro") != null){ %>
    <p> <%= request.getAttribute("erro") %> </p>
    <% } %>
</body>
</html>