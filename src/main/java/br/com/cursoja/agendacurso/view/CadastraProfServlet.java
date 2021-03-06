package br.com.cursoja.agendacurso.view;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.cursoja.agendacurso.controller.ProfessorController;
import br.com.cursoja.agendacurso.entidade.Professor;

/**
 * Servlet implementation class CadastraProfServlet
 */
public class CadastraProfServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastraProfServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nome = request.getParameter("nomeprof");
		String celular = request.getParameter("celular");
		String strValorHora = request.getParameter("valorhora");

		double valorhora = 0;

		try{
			valorhora = Double.parseDouble(strValorHora);
		}catch(Exception e){}

		Professor p = new Professor();
		p.setNome(nome);
		p.setCelular(celular);
		p.setValorHora(valorhora);

		ProfessorController controller = new ProfessorController();

		controller.cadastrar(p);
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
		
	}

}
