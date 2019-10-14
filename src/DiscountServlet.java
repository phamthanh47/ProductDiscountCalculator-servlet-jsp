import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/productdiscountcalculator")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String description= request.getParameter("productdescription");
   float listprice=Float.parseFloat(request.getParameter("listprice"));
   float  discountpercent=Float.parseFloat(request.getParameter("discountpercent"));
   float discountAmount= (float) (listprice*discountpercent*0.01);
   float discountprice= listprice-discountAmount;
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("<h1> Description: "+description+"</h1>");
        writer.println("<h1> List price:"+listprice+"</.h1>");
        writer.println("<h1> Discount Percent: "+discountpercent+"</h1>");
        writer.println("<h1> Discount Amount:"+discountAmount+"</h1>");
        writer.println("<h1>Discount Price: "+discountprice+"</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
