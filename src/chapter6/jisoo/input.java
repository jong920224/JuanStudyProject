package chapter6.jisoo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class input
 */
@WebServlet("/input")
public class input extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public input() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 예제 2번
		request.setCharacterEncoding("UTF-8");
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		String[] subject = request.getParameterValues("subject");
		
		System.out.println("아이디 : " + user_id);
		System.out.println("비밀번호 : " + user_pw);
		
		for(String str : subject) {
			System.out.println("선택한 과목 : " + str);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 예제 3번
		request.setCharacterEncoding("UTF-8");
		Enumeration<String> enu = request.getParameterNames();
		
		while(enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			String [] values = request.getParameterValues(name);
			
			for(String str : values) {
				System.out.println("name :" + name + " / value = " + str);
			}
		}
		
	}

}
