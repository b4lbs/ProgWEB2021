package trab_final;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletAutentica")
public class ServletAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "usuario";
       
    public ServletAutentica() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<html><body>");
		
		String usuario = request.getParameter(USUARIO);
		String senha = request.getParameter("senha");
		
		if (autentica(usuario,senha)) {
			HttpSession sessao = request.getSession(); //sessão
			sessao.setAttribute(USUARIO, usuario); //usuário sessão
			
			response.sendRedirect(request.getContextPath()+"/menu.jsp"); //volta menu
		}else {
			saida.write("Usuário ou Senha incorreto(s). <br>");
			saida.write("<a href=\"autentica.jsp\">Tentar novamente.</a>");
		}
		
		
	}
	private boolean autentica(String usuario, String senha) {
		if (usuario.equals("professor") && senha.equals("Progweb2021")) {
			return true;
		}
		//Usuário deve ser 'professor' e senha deve ser 'Progweb2021'
		
		return false;
	}

}