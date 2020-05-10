
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter6
 */
@WebServlet("/Chapter6")
public class Chapter6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Chapter6() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// ȭ�� �ܿ��� ���� �Ķ����
		String param = (String) request.getParameter("param");
		
		// WEB-INF �����ȿ� �ִ� html, jsp������ ���������� ������ �Ұ����ϱ� ������
		// �������� ȭ���� ȣ���ؾ� ��. 
		String testURL = "/WEB-INF/" + param + "/chapter6_view/chapter6.html";
		
		// ���� testURL�� ��η� �̵��ϱ� ����
		// Dispatcher forward ����� �̿���.
		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher(testURL);
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getHeaderNames());
		System.out.println(request.getContentType());
		doGet(request, response);	
	}

}
