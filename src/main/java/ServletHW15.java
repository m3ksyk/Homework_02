import pl.coderslab.web.Servlet15;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

@WebServlet("/ServletHW15")
public class ServletHW15 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i <= list.size(); i++){
            int rand = random.nextInt(100);
            if(rand != 0){
                list.add(rand);
            }
        }
        response.getWriter().append(Arrays.toString(list.toArray()) + "\n");
        Collections.sort(list);
        response.getWriter().append("*****");
        response.getWriter().append(Arrays.toString(list.toArray()));

    }
}
