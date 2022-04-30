<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="br.com.cursoja.agendacurso.entidade.Turma" %>
    <%@ page import ="br.com.cursoja.agendacurso.controller.TurmaController" %>
    <%@ page import ="java.util.ArrayList" %>
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
		TurmaController controller = new TurmaController();
		ArrayList<Turma> turmas = controller.listar();
		
		for(Turma t : turmas){
	%>
		<p type=date><%= t.getDataInicio() %></p>
	<% } %>
</body>
</html>