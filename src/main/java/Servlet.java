import calulator.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        String operator = request.getParameter("operator");
        float result = Calculator.Calculators(first,second,operator);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");
        writer.println("<h2>" + first + operator + second + " = " + result + "</h2>");
        writer.println("</html>");
    }
}
