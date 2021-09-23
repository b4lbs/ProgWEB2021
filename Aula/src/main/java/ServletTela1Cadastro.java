
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela1Cadastro
 */
@WebServlet("/ServletTela1Cadastro")
public class ServletTela1Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela1Cadastro() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doPost(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter resposta = response.getWriter();
    	
    	resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Dados Profissionais</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("Preencha seus dados profissionais:");
        resposta.write("<form action=\"ServletTela2Cadastro\">");
        
        String nome =  request.getParameter("nome");
        String sobrenome =  request.getParameter("sobrenome");
        String rua =  request.getParameter("rua");
        String complemento =  request.getParameter("complemento");
        String cidade =  request.getParameter("cidade");
        String cep =  request.getParameter("cep");
        String estado =  request.getParameter("estado");
        HttpSession cadastro = request.getSession();
        cadastro.setAttribute("nome", nome);
        cadastro.setAttribute("sobrenome", sobrenome);
        cadastro.setAttribute("rua", rua);
        cadastro.setAttribute("complemento", complemento);
        cadastro.setAttribute("cidade", cidade);
        cadastro.setAttribute("cep", cep);
        cadastro.setAttribute("estado", estado);
        
        resposta.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
        resposta.write("Endereço profissional:<BR>");
        resposta.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
        resposta.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
        resposta.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
        resposta.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
        resposta.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
        resposta.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
        resposta.write("</form>");
        resposta.write("</body></html>");
    	
    }

}