package conversorservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conversor.Conversor;

/**
 * Servlet implementation class ServletConverter
 */
@WebServlet("/ServletConverter")
public class ServletConverter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConverter() {
        super();
        // TODO Auto-generated constructor stub
    }
  public void service(HttpServletRequest pedido, HttpServletResponse resposta){
	  String nrRomano = pedido.getParameter("nrRomano");
	 int resultado = new Conversor().traduzirNumeralRomano(nrRomano);
	  pedido.setAttribute("resultadoConversor", resultado);
	  RequestDispatcher rd = pedido.getRequestDispatcher("/index.jsp");
	  try {
		rd.forward(pedido, resposta);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
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
		doGet(request, response);
	}

}
