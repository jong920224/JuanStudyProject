
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
		
		// 화면 단에서 던진 파라미터
		String param = (String) request.getParameter("param");
		
		// WEB-INF 폴더안에 있는 html, jsp파일은 직접적으로 접근이 불가능하기 떄문에
		// 서버에서 화면을 호출해야 함. 
		String testURL = "/WEB-INF/" + param + "/chapter6_view/chapter6.html";
		
		// 위에 testURL의 경로로 이동하기 위해
		// Dispatcher forward 방식을 이용함.
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
