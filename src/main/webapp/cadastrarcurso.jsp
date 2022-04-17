<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action ="CursoServlet">
		<label>Nome</label>
		<input type="text" name="nome" required />
		
		<label>Valor:</label>
		<input type="number" name="mensalidade" step="0.01" required/>
		
		
		<input type="submit" value="Gravar" />
	</form>
</body>
</html>