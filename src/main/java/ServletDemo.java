import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDemo", value = "/cal")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int result = a+b;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>a: " + a + "</h1>");
        writer.println("<h1>b: " + b + "</h1>");
        writer.println("<h1>a+b = " + result + "</h1>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int result = a+b;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>a: " + a + "</h1>");
        writer.println("<h1>b: " + b + "</h1>");
        writer.println("<h1>a+b = " + result + "</h1>");
        writer.println("</html>");
    }
}
