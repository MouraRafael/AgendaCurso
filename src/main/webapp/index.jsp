<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="br.com.cursoja.agendacurso.entidade.Turma" %>
    <%@ page import ="br.com.cursoja.agendacurso.controller.TurmaController" %>
    <%@ page import ="java.util.ArrayList" %>
    <%@ page import ="java.text.SimpleDateFormat" %>
    <%@ page import="java.text.DecimalFormat" %>
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
	<table>
		<thread>
			<th>Curso</th>
			<th>Data Início</th>
			<th>Data Fim</th>
			<th>Mensalidade</th>
		</thread>
		<tbody>
	<%
		TurmaController controller = new TurmaController();
		ArrayList<Turma> turmas = controller.listar();
		
		DecimalFormat fmt = new DecimalFormat("###,##0.00");
		SimpleDateFormat fmtData = new SimpleDateFormat("dd/MM/yyyy");
		for(Turma t : turmas){
	%>
	
		<tr>
			<td><%= t.getCurso().getNome() %></td>
			<td><%= fmtData.format(t.getDataInicio()) %></td>
			<td><%= fmtData.format(t.getDataFim()) %></td>
			<td><%= fmt.format( t.getCurso().getValor()) %></td>
		</tr>
	
		
		
		
		
		
		
	<% } %>
		</tbody>
	</table>
</body>
</html>