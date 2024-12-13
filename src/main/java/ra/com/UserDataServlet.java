package ra.com;

import ra.com.entity.UserData;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
/*
* jsp --> jsp: chuyen duong dan dung den trang jsp
* servlet --> jsp: request.getRequestDispatcher("duong dan trang jsp").forward(resquest,response)
* jsp --> servlet: chuyen duong dan dung den servlet
* request.getContextPath --> lay lai duong dan goc localhost:8080
* Lay du lieu trong request can co thu vien jstl maven
* */
//localhost:8080/UserDataServlet
@WebServlet(name = "UserDataServlet", value = "/UserDataServlet")
public class UserDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Tao doi tuong UserData
        UserData userData = new UserData(1, "Nguyen Duy Quang", "quangnd@rikkei.edu.vn", 41);
        //Hien thi thong tin userData tren trang jsp la information.jsp
        //B1: add userData vao trong request
        request.setAttribute("userData", userData);
        //B2. Chuyen sang trang information.jsp va chuyen toan bo request va response
        request.getRequestDispatcher("views/information.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}