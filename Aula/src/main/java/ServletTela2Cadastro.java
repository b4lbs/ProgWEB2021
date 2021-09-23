import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletTela2Cadastro
 */
@WebServlet("/ServletTela2Cadastro")
public class ServletTela2Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTela2Cadastro() {
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
    	
    	HttpSession cadastro = request.getSession();
        String nome = (String) cadastro.getAttribute("nome");
        String sobrenome = (String) cadastro.getAttribute("sobrenome");
        String rua = (String) cadastro.getAttribute("rua");
        String complemento = (String) cadastro.getAttribute("complemento");
        String cidade = (String) cadastro.getAttribute("cidade");
        String cep = (String) cadastro.getAttribute("cep");
        String estado = (String) cadastro.getAttribute("estado");



        resposta.write("<html>");
        resposta.write("<head>");
        resposta.write("<title>Confirmação de registro</title>");
        resposta.write("</head>");
        resposta.write("<body>");
        resposta.write("<h3>Registro efetuado com sucesso!</h3><br/><br/>");
        resposta.write("<b>Seus dados pessoais:</b><br/>");
        resposta.write(nome + " " + sobrenome);
        resposta.write("<br/>");
        resposta.write(rua);
        resposta.write("<br/>");
        resposta.write(complemento);
        resposta.write("<br/>");
        resposta.write(cidade);
        resposta.write(", ");
        resposta.write(cep);
        resposta.write(", ");
        resposta.write(estado);
        resposta.write("<br/>");
        resposta.write("<b>Seus dados profissionais:</b><br/>");
        resposta.write(request.getParameter("empresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("ruaEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("complementoEmpresa"));
        resposta.write("<br/>");
        resposta.write(request.getParameter("cidadeEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("cepEmpresa"));
        resposta.write(", ");
        resposta.write(request.getParameter("estadoEmpresa"));
        resposta.write("</body></html>");

    }

}