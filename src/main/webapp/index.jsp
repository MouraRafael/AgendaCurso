<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="br.com.cursoja.agendacurso.model.dao.Conexao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projetinho</title>
</head>
<body>
	<h1>Olá Mundo, agora na "web"</h1>
	<p>Agora estamos todos</p>
	<a href="login.jsp">area admin</a>
	<%
	Conexao c = new Conexao();
	c.getConexao();
	
	c.fecharConexao();
	%>
</body>
</html>