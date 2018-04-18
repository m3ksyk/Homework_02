import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletHW142")
public class ServletHW142 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("id"));

        String products[] = {
                "Asus Transformr;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };

        try {
            response.getWriter().append(products[i].replaceAll(";"," - ") + " PLN");
        }catch (IndexOutOfBoundsException e){
            response.getWriter().append("Product not found");
        }

    }
}
