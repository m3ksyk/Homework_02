import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletHW141")
public class ServletHW141 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=0> product id 0 </a>  <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=1> product id 1 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=2> product id 2 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=3> product id 3 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=4> product id 4 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=5> product id 5 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=6> product id 6 </a> <br>");
        response.getWriter().append("<a href=http://localhost:8080/ServletHW142?id=7> product id 7 </a> <br>");
    }
}