package chapter6.jisoo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// HttpServletRequest
		// �� ���������� ������ ������ ��Ĺ �����̳ʰ� HttpServletRequest ��ü�� ������ �� doGet���� �Ѱ���
		
		// ���� �� �����͸� UTF-8�� ���ڵ�
		request.setCharacterEncoding("UTF-8");
		
		// getParameter()�� �̿��Ͽ� input �±��� name �Ӽ� ������ ���۵� value�� ����.
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		
		System.out.println(user_id);
		System.out.println(user_pw);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
