<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="br.com.cursoja.agendacurso.entidade.Curso" %>
<%@ page import="java.text.DecimalFormat" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Curso</title>
</head>
<body>
<%
	Curso cursoAlterar = (Curso) request.getAttribute("curso");
%>

<form method="post" action="">
<label>Nome: </label>
<input type="text" name="nomecurso" value ="<%= cursoAlterar.getNome() %>"/>
<label>Valor: </label>
<input type="number" name="mensalidade" value ="<%= cursoAlterar.getValor() %>" step="0.01"/>

<input type="hidden" name="id" value ="<%= cursoAlterar.getId() %>" />

<input type="submit" value="alterar" />
</form>
</body>
</html>