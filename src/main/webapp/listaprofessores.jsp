<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="br.com.cursoja.agendacurso.controller.ProfessorController" %>
<%@ page import="br.com.cursoja.agendacurso.entidade.Professor" %>  
<%@ page import="java.util.ArrayList" %>  
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

 <!-- CSS only -->
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <!-- JavaScript Bundle with Popper -->
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 <title>Cadastro de Professores</title>
</head>
<body>
    <div class="infinit__table">
       <table class="table table-dark table-striped table-bordered">
            <thead id="thead">
                <tr>
                    <th>Nome</th>
                    <th>Celular</th>
                    <th>Valor Hora</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
              <%
                ProfessorController controller = new ProfessorController();
                ArrayList<Professor> lista = controller.listar("");
                DecimalFormat fmt = new DecimalFormat("#,##0.00");
                
                for(Professor p : lista){
              %>
                  <tr>
                    <td><%= p.getNome() %></td>
                    <td><%= p.getCelular() %></td>
                    <td><%= fmt.format(p.getValorHora()) %></td>
                    <td>
                        Alterar | 
                        Excluir
                    </td>
                  </tr>
              <% } %>
            </tbody>
       </table>
    </div>


</body>
</html>