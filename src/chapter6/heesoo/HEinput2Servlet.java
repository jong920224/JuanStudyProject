package chapter6.heesoo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HEinput2")
public class HEinput2Servlet extends HttpServlet{
  private final static long serialVersionUID = 1L;
  public void init() throws ServletException {
    System.out.print("init 메서드 호출");
  }
  
  protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    Enumeration enu = request.getParameterNames(); //전송되어 온 name 속성들만 Enumeraion타입으로 받는다.
    while (enu.hasMoreElements()){
      String name = (String) enu.nextElement();
      String[] values = request.getParameterValues(name);
      for (String value : values){
        System.out.print("name=" + name + ",value = " + value);
      }
    }
  }

  public void destroy(){
    System.out.println("destroy 메서드 호출");
  }

}
