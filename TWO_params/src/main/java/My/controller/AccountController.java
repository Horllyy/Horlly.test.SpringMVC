package My.controller;

import My.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/accountController")
public class AccountController {


    @RequestMapping("/saveAccount")
//    public String saveAccount(HttpServletRequest request,Account account) throws UnsupportedEncodingException {
//       request.setCharacterEncoding("UTF-8");
    //没有用哦 或许在user和account类里也要init来一下？
    public String saveAccount(Account account) {
        System.out.println("执行了saveAccount方法");
        System.out.println(account);
        return "succeed";
    }

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("执行了testServlet方法");
        System.out.println("request=  "+request);
        System.out.println("response=  "+response);
        HttpSession session=request.getSession();
        System.out.println("session=  "+session);
        ServletContext servletContext=session.getServletContext();
        System.out.println("servletContext=  "+servletContext);
        return "succeed";
    }
}
