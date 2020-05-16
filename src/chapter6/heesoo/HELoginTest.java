package chapter6.heesoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JUANSTUDYPROJECT/HEloginTest")
public class HELoginTest  extends HttpServlet{
  private final static long serialVersionUID = 1L;

  public void init(){
    System.out.print("init 메서드 호출");
  }

  protected  void doPOST(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html; charset=utf-8");
    PrintWriter out = response.getWriter();
    String id = request.getParameter("user_id");
    String pw = request.getParameter("user_pw");

    System.out.println("아이디 : " + id);
    System.out.println("패스워드 : " + pw);
    
  
    if( id!= null && (id.length()!=0)){
      if (id.equals("admin")){

      }else{
        out.print("<html>");
        out.print("<body>");
        out.print(id + "님!! 로그인 하셨습니다.");
      }
      
    }else{
      out.print("<html>");
      out.print("<body>");
      out.print("아이디와 비밀번호를 입력하세요!");
      out.print("<br>");
      out.print("<a href='http://localhost:8090/JUANSTUDYPROJECT'> 로그인창으로 이동</a>");
    }
  }

  public void destroy(){
    System.out.print("destroy 메서드 호출");
  }
}
