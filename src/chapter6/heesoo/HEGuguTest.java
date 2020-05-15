package chapter6.heesoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HEguguTest")
public class HEGuguTest extends HttpServlet {
  private final static long serialVersionUID = 1L;
  public void init(){
    System.out.print("init 메서드 호출");
  }

  protected void doGET(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    int dan = Integer.parseInt(request.getParameter("dan"));
    out.print(" <table border=1 width=800 align=center>");
    out.print("<tr align = center bgcolor = '#FFFF66'>");
    out.print("<td colspan=2" + dan + " 단 출력 </td>");
    out.print("</tr>");
    for(int i =1; i<10; i++){
      out.print("<tr align=center>");
      out.print("<td width=400>");
      out.print(dan + " * " + i);
      out.print("</td>");
      out.print("<td width=400>");
      out.print(i * dan);
      out.print("</td>");
      out.print("</tr>");
    }
    out.print("</table>");

  }
  public void destroy(){
    System.out.print("destroy 메서드 호출");
  }
}
