package chapter6.heesoo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HEcalc")
public class HECalcServlet extends HttpServlet{
  private static final long serialVersionUID = 1L;
  
  protected void toGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html; charset=utf-8");
    PrintWriter pw = response.getWriter();
    String command = request.getParameter("command");
    String won = request.getParameter("won");
    String operator = request.getParameter("operator");

    if (command != null && command.equals("calculate")){
      String result = calculate(Float.parseFloat(won), operator);
      pw.print("<html><font size=10>변환 결과</font><br>");
      pw.print("<html><font size=10>" + result + "</font><br>");
      pw.print("<a href ='/HEcalc'>환율 계산기</a>");
      return;
    }
    pw.print("<html><title>환율 계산기</title>");
    pw.print("<font size =5>환율 계산기</font><br>");
    pw.print("form name='frmCalc' method='get' action='/HEcalc'");
    pw.print("원화: <input type ='text' name='won' size=10 />");
    pw.print("<select name= 'operator'>");
    pw.print("option value='dollar'달러</option>");
    pw.print("option value ='en'>엔화</option>");
    pw.print("option value ='wian'>위안/option>");
    pw.print("option value = 'pound'>파운드</option>");
    pw.print("option value ='euro'>유로</option>");
    pw.print("</select>");
    pw.print("<input type='hidden' name='command' value='calculate' />");
    pw.println("<input type='submit value='변환' />");
    pw.println("</form>");
    pw.print("</html>");
    pw.close();
    

  }
  private static String calculate(float won, String operator){
    //원화를 외화로 변환 하기 위함
    String result = null;
    if (operator.equals("dollar")){
      result = String.format("%.6f", won/ 1229.41);
    }else if (operator.equals("en")){
      result = String.format("%.6f", won/ 11.46);
    }else if (operator.equals("wian")){
      result = String.format("%.6f", won/ 173.42);
    }else if (operator.equals("pound")){
      result = String.format("%.6f", won/ 1501.45);
    }else if (operator.equals("euro")){
      result = String.format("%.6f", won/ 1328.64);
    }
    return result;
  }
}
