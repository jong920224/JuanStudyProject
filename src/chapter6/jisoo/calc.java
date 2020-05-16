package chapter6.jisoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calc
 */
@WebServlet("/calc")
public class calc extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private static float USD_RATE = 1124.70F;
	private static float JPY_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		// String command = request.getParameter("command");
		String won = request.getParameter("won");
		String operator = request.getParameter("operator");
		
		// �����
		String result = calculate(Float.parseFloat(won), operator);
		
		// ���
		PrintWriter pw = response.getWriter();
		
		pw.print("<html><font size=10>��ȯ���</font><br>");
		pw.print("<html><font size=10>type : " + operator+ "</font><br>");
		pw.print("<html><font size=10>" + result + "</font><br>");
		pw.print("<a href='/chapter6_jisoo?param=exam4'>���ư��� </a>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private static String calculate(float won, String operator) 
	{
		String result = "";
		
		if (operator.equals("dollar")) {
			result = String.format("%.6f", won / USD_RATE);
		} else if (operator.equals("en")) {
			result = String.format("%.6f", won / JPY_RATE);
		} else if (operator.equals("wian")) {
			result = String.format("%.6f", won / CNY_RATE);
		} else if (operator.equals("pound")) {
			result = String.format("%.6f", won / GBP_RATE);
		} else if (operator.equals("euro")) {
			result = String.format("%.6f", won / EUR_RATE);
		}
		return result;
	}
}
