package chapter6.jiyoung;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jiyoung/login01")
public class Login01 extends HttpServlet{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void init() {
        System.out.println("call init() ");
    } // init end

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        PrintWriter out = response.getWriter();

        String id = request.getParameter("user_id");
        String pw = request.getParameter("user_pw");

        System.out.println("아이디 : " + id);
        System.err.println("패스워드 : " + pw);

        if(id != null && id.length()!=0) {
            out.print("<html>");
            out.print("<body>");
            out.print(id + "님 로그인 하셨습니다");
            out.print("<body>");
            out.print("</html>");
        } else {
            out.print("<html>");
            out.print("<body>");
            out.print("아이디를 입력하세요");
            out.print("<body>");
            out.print("</html>");

        } // if end
    } // postend

    public void destroy(){
        System.out.println("call destroy() ");
    } // end destroy
    
}