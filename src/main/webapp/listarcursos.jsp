<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="br.com.cursoja.agendacurso.controller.CursoController" %>
<%@ page import="br.com.cursoja.agendacurso.entidade.Curso" %>  
<%@ page import="java.util.ArrayList" %>  
 <%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listagem de Cursos</title>
</head>
<body>
	<%
	String nomeBusca = request.getParameter("busca");
	
	if(nomeBusca == null){
		nomeBusca = "";
	}
	%>
	<a href="cadastrarcurso.jsp">Cadastrar</a>
	<form method="post" action="listarcursos.jsp" value=<%= nomeBusca %>>>
		<p>
			<input type="text" name="busca">
			<input type="submit" name="submit">
		</p>
	</form>
	<table>
		<thead>
			<th>Nome</th>
			<th>Valor</th>
			<th>Ações</th>
		</thead>
		<tbody>
	<% 
		
		
	
		CursoController controller = new CursoController();
		ArrayList<Curso> lista = controller.listar(nomeBusca);
		DecimalFormat fmt = new DecimalFormat("###,##0.00"); // A tralha marca como opcional
		for (Curso c : lista) {
	%>	
			<tr>
				<td><%= c.getNome() %></td>
				<td><%= fmt.format(c.getValor()) %></td>
				<td>
				<a href="InicioAlteraCurso?id=<%=c.getId() %>">Alterar</a>
				<a href="ExcluirCurso?id=<%= c.getId() %>" onclick="return confirm('Deseja realmente deletar o curso <%= c.getNome() %>?')">Excluir</a>
				</td>
			</tr>
	
	<% } %>
		</tbody>
	</table>
</body>
</html>