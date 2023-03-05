import java.io.IOException;
import java.io.PrintWriter;

import  javax.servlet.ServletException;
import  javax.serlet.annotation.WebServlet;
import  javax.serlet.http.HttpSerlet;
import  javax.serlet.http.HttpServletRequest;
import  javax.serlet.http.HttpServletResponse;
@WebSerlet("/hello")
public class Hello extends HttpServlet {
    @override
    protected void doGet(
            HttpSerletRequest request, HttpSerletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Hello</title>");
        out.print("</head>");
        out.print("<body>");
        out.printf("<h1> Hello! %s!%n</h1>",name);
        out.print("</body>");
        out.print("</html>");
    }

}
