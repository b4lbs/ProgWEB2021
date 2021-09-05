

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNomeSobrenome
 */
@WebServlet("/ServletNomeSobrenome")
public class ServletNomeSobrenome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNomeSobrenome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter(); 
        saida.write("<HTML><BODY>");
        saida.write("Saudacoes " + request.getParameter ("nome") + " " + request.getParameter("sobrenome") + "");
        saida.write("<BR>");
        saida.write("</BODY></HTML>");
        saida.close();

                }

    public static String getPrintwriter() {
        return getPrintwriter();
    }

}
