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
		
		// ���� 2��
		request.setCharacterEncoding("UTF-8");
		
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		String[] subject = request.getParameterValues("subject");
		
		System.out.println("���̵� : " + user_id);
		System.out.println("��й�ȣ : " + user_pw);
		
		for(String str : subject) {
			System.out.println("������ ���� : " + str);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ���� 3��
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
