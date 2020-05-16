package chapter6.jiyoung;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jiyoung/gugu3")
public class gugu3 extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void init() {
        System.out.println("call init");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
        request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int dan =Integer.parseInt( request.getParameter("dan"));  

        PrintWriter out = response.getWriter();
		out.print(" <table border=1 width=1200  align=center>");
		out.print("<tr align=center bgcolor='#FFFF66'>");
		out.print("<td colspan=4>" + dan + " 단 출력  </td>");
		out.print("</tr>");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				out.print("<tr align=center bgcolor='#ACFA58'> ");
			} else {
				out.print("<tr align=center bgcolor='#81BEF7'> ");
			}
			out.print("<td width=200> ");
			out.print("<input  type='radio'  />" + i);
			out.print("</td>");
			out.print("<td width=200> ");
			out.print("<input  type='checkbox'  />" + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(dan + " *  " + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
		}

		out.print("</table>");
    }
    public void destroy(){
        System.out.println("call destroy() ");
    } // end destroy

}