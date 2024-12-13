package ra.com;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

//localhost:8080/DateServlet
//request.getContextPath --> localhost:8080
@WebServlet(name = "DateServlet", value = "/DateServlet")
public class DateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Lay thoi gian cua he thong
        LocalTime now = LocalTime.now();
        //Servlet --> goi sang trang jsp de hien thi thoi gian cua he thong
        //-B1: add du lieu thoi gian vao request
        request.setAttribute("timeNow", now);
        //-B2: Chuyen tu servlet sang trang jsp hien thi ca du lieu request va response
        request.getRequestDispatcher("views/ketquaBT1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}