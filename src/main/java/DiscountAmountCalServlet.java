import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountAmountCalServlet", value = "/calDiscount")
public class DiscountAmountCalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDes = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("discountPercent"));

        double discountAmount = price * percent * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Product Description:  " + productDes + "</h1>");
        writer.println("<h1> Price:  " + price + "</h1>");
        writer.println("<h1> Discount Price: " + discountAmount + "</h1>");
        writer.println("</html>");
    }
}
