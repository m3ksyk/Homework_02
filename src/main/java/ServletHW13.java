import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ServletHW13")
public class ServletHW13 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //change path in case of moving the file or project!!
        File file = new File("/home/m3ksyk/workspace/newserv/1/Servlety/src/main/oop.txt");
        PrintWriter printWriter = response.getWriter();

        List<String> list = FileUtils.readLines(file, "UTF-8");

        for (String line : list) {
            printWriter.println(line);
        }
    }
}
