package chapter6.jisoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login3
 */
@WebServlet("/login3")
public class login3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login3() {
    	System.out.println("init �޼��� ȣ��");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		String address = request.getParameter("user_addr");

		String data = "<html>";
		data += "<body>";
		data += "���̵� : " + id;
		data += "<br>";
		data += "��й�ȣ : " + pw;
		data += "<br>";
		data += "�ּ� : " + address + "<br>";
		data += "<a href='/chapter6_jisoo?param=exam5'>���ư���</a>";
		data += "</html>";
		data += "</body>";
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
