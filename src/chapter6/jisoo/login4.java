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
    	System.out.println("init 메서드 호출");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		String data = "<html>";
		
		// 아이디 패스워드 입력값이 있으면
		if((id.length() > 0 || !id.equals("")) && pw.length() > 0 || !pw.equals("")) 
		{
			data += "<body>";
			
			// admin 계정일 경우
			if(id.equals("admin") && pw.equals("admin")) 
			{
				data += "[관리자]로 로그인 하였습니다.!";
			} else {
				data += "아이디 : " + id +"님 로그인 성공!";
			}
			
			data += "<br>";
			data += "<br>";
			data += "</html>";
			data += "</body>";
		} else {
			data += "<body>";
			data += "아이디를 입력하세요.";
			data += "<br>";
			data += "<br>";
			data += "<a href='/chapter6_jisoo?param=exam6'>로그인 화면으로</a>";
			data += "</html>";
			data += "</body>";
		}
		
		out.print(data);
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
