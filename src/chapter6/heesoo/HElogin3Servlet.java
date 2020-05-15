package chapter6.heesoo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Helogin3")
public class HELogin3Servlet extends HttpServlet{
  private static final long serialVersionUID = 1L;
   
  public void init() throws ServletException{
    System.out.print("init 메서드 호출");
  }

  protected  void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    System.out.print("doGET 메서드 호출");
    doHandle(request, response);
  }
  
  protected void doPOST(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException{
    System.out.print("doPOST  메서드 호출");
    doHandle(request, response);
  }

  private void doHandle(HttpServletRequest request,HttpServletResponse response ) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    System.out.println("doHandle  메서드 호출");
    String user_pw = request.getParameter("user+pw");
    System.out.println("아이디 : " + user_id);
    System.out.println("패스워드 : " + user_id);
  }

  public void destroy(){
    System.out.println("destroy 메서드 호출");
  }
}
