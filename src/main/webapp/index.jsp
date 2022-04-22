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
	<a href="cadastrarcurso.jsp">Cadastrar</a>
	<a href="listarcursos.jsp">Listar</a>
	<a href="cadastrarprofessor.jsp">Cadastar Professor</a>
	<a href="listaprofessores.jsp">Listagem de Professores</a>
	<%
	Conexao c = new Conexao();
	c.getConexao();
	
	c.fecharConexao();
	%>
</body>
</html>