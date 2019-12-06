package My.controller;

import My.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        System.out.println("testForwardOrRedirect。。。");
        // return "forward:/WEB-INF/pages/succeed.jsp";
        //请求转发

        return "redirect:/response.jsp";
        //重定向
    }


    //Response的作用是将最终return的user对象转成字符串
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了。。。");

        //客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中 只要参数名字都一样
        System.out.println(user);
        //做响应 模拟按照密码查询数据库
        user.setUname("哈哈哈");
        user.setAge(22);
        //作响应
        return user;
    }

}
