<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import ="br.com.cursoja.agendacurso.entidade.Professor" %>
<%@ page import="java.text.DecimalFormat" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <!-- CSS only -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- JavaScript Bundle with Popper -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 <title>Editar Dados de Professor</title>
</head>
<body>
    <%
        Professor professoralterar = (Professor) request.getAttribute("professor");
    %>
    <div class="container col-6">
        <fieldset>
            <legend>Editar Dados do Professor</legend>
            <form action="ExecutaAlteraProfessor" method="post">
                <div class="form-group">
                    <label for="nome" class="form-label">Nome do Professor</label>
                    <input type="text" class="form-control" id="nome" name="nomeprof" placeholder="Digite o nome do professor" value="<%= professoralterar.getNome() %>" required>
                </div>
                <div class="form-group">
                    <label for="cel" class="form-label">Celular</label>
                    <input type="text" class="form-control" id="cel" name="celular" placeholder="Digite o celular do professor" value="<%= professoralterar.getCelular() %>" required>
                </div>
                <div class="form-group">
                    <label for="vhora" class="form-label">Valor Hora</label>
                    <input type="number" step="0.01" class="form-control" id="vhora" name="valorhora" placeholder="Digite o Valor/Hora do professor" value="<%= professoralterar.getValorHora() %>" required>
                </div>
                <button class="btn btn-dark my-2" type="submit" name="id" value="<%= professoralterar.getId() %>"">Cadastrar</button>

            </form>
        </fieldset>
    </div>


</body>
</html>