package My.controller;

import My.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password, Date date){
        System.out.println("执行了。。。");
        System.out.println(username);
        System.out.println(password);
        System.out.println(date);
        return "succeed";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了saveUser方法。。。");
        System.out.println(user);
        return "succeed";
    }
}
