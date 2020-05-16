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
@WebServlet("/login4")
public class login4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login4() {
    	System.out.println("init �޼��� ȣ��");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data = "<html>";
		
		// 테스트
		if((id.length() > 0 || !id.equals("")) && pw.length() > 0 || !pw.equals("")) 
		{
			data += "<body>";
			
			// admin ������ ���
			if(id.equals("admin") && pw.equals("admin")) 
			{
				data += "[������]�� �α��� �Ͽ����ϴ�.!";
			} else {
				data += "���̵� : " + id +"�� �α��� ����!";
			}
			
			data += "<br>";
			data += "<br>";
			data += "</html>";
			data += "</body>";
		} else {
			data += "<body>";
			data += "���̵� �Է��ϼ���.";
			data += "<br>";
			data += "<br>";
			data += "<a href='/chapter6_jisoo?param=exam6'>�α��� ȭ������</a>";
			data += "</html>";
			data += "</body>";
		}
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
