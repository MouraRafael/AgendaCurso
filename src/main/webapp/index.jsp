<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="br.com.cursoja.agendacurso.model.dao.Conexao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Projetinho</title>
</head>
<body>
	<h1>Ol� Mundo, agora na "web"</h1>
	<p>Agora estamos todos</p>
	<a href="cadastrarcurso.jsp">Cadastrar</a>
	<a href="listarcursos.jsp">Listar</a>
	<a href="cadastrarprofessor.jsp">Cadastar Professor</a>
	<%
	Conexao c = new Conexao();
	c.getConexao();
	
	c.fecharConexao();
	%>
</body>
</html>