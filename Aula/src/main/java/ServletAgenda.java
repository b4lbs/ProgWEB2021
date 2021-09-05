

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PrintWriter = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter(); 
        saida.write("<HTML><BODY>");
        saida.write("Nome:" + request.getParameter ("nome") + " | Data de Nascimento:" +    request.getParameter ("datanasc") + " | Telefone:" + request.getParameter ("tel") + "");
        saida.write("<BR>");



        saida.write("</BODY></HTML>");
        saida.close();

                }

    public static String getPrintwriter() {
        return PrintWriter;
    }

}