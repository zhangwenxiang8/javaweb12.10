package work.controller;

import work.pojo.User;
import work.service.IUserService;
import work.service.UserServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DologinServlet extends HttpServlet {

    private IUserService service = new UserServicelmpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username= req.getParameter("username");
        String password= req.getParameter("pwd");
       User u= service.getOne(username);
       if (u==null){
                resp.sendRedirect("register");
       }else{
           if (u.getPassword().equals(password)){
               resp.sendRedirect("list");
           }
       }

    }
}
