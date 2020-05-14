package chapter6.heesoo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HEinput")
public class HEinputServelt extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  public void init() throws ServletException{
    System.out.println("메서드호출");
  }

  protected void doGET(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
    System.out.println("아이디: " + user_id);
    System.out.println("비밀번호: " + user_pw);
    //하나의 name으로 여러값을 전송하는 경우 parametervalues를 사용한다. 배열형태다.
    String[] subject = request.getParameterValues("subject");
    for(String str: subject){
      System.out.print("선택한 과목: " +  str);
    }

  }
  public void destroy(){
    System.out.println("destroy 메서드 호출");
  }
}
