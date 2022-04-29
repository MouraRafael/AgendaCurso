<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import ="br.com.cursoja.agendacurso.entidade.Usuario" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("UsuarioLogado") == null){
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
	
}

Usuario u = (Usuario) session.getAttribute("UsuarioLogado");

%>
<h1>Olá <%= u.getNome() %></h1>

<a href="cadastrarcurso.jsp">Cadastrar</a>
	<a href="listarcursos.jsp">Listar</a>
	<a href="cadastrarprofessor.jsp">Cadastar Professor</a>
	<a href="listaprofessores.jsp">Listagem de Professores</a>
	<a href="LogoffServlet">Logoff</a>
	
</body>
</html>