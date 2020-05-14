package chapter6.heesoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HElogin2")
public class HElogin2Servlet  extends HttpServlet{
  private final static long serialVersionUID = 1L;
  
  public void init() throws ServletException {
    System.out.print("메서드 시작");
  }

  protected void doGET(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    String id = request.getParameter("user_id");
    String pw = request.getParameter("user_pw");

    String data = "<html>";
    data += "<body>";
    data += "아이디 : " + id;
    data += "<br>";
    data += "패스워드: " + pw;
    data += "</body>";
    data += "</html>";
    out.print(data);

  }

  public void destroy(){
    System.out.print("destroy 메서드 호출");
  }
}
