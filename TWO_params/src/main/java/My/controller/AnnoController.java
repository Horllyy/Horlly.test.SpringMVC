package My.controller;

import My.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;


@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"color","message"})//这是存到session域中了,经检验发现只有通过model过的message才能存进去
public class AnnoController {

    @RequestMapping(value="/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        System.out.println(body.length());
        return "succeed";
    }

    @RequestMapping(value="/testModelAttribute")
    public String testModelAttribute(User user){//只要网页上有对应的相同参数 那么必直接从网页上取来覆盖 没有的才从ModelAttribute方法取
        System.out.println("执行了testModelAttribute方法");
        System.out.println(user);
        return "succeed";
    }

    @ModelAttribute
    public User showUser(String username,String uname){
        System.out.println("执行了showUser方法...");
        User user=new User();
        System.out.println(uname);//和网页上参数不同的参数取不到
        System.out.println(username);
        user.setUname(username);//原本是通过这个名字去数据库中查询此用户 现在简单模拟一下 省略数据库查询过程
       user.setUname("ALIU");//说明testModelAttribute方法的数据尽可能还是从从网页直接接收的 这里真的只是在网页前的一个小小预处理 且不return将毫无意义
        user.setAge(21);
        user.setDate(new Date());
        return user;
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model, String color, String brand){
        System.out.println("执行了testSessionAttribute方法。。。");
        System.out.println(color);
        System.out.println(brand);
        model.addAttribute("message","聪明的horlly" +",  color="+color+",  brand="+brand);
        //model的addAttribute方法是存到request域中
        return "succeed";
    }


    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap, String color, String brand){
        System.out.println("执行了getSessionAttribute方法。。。");
        System.out.println(color);
        System.out.println(brand);
        String str=(String)modelMap.get("message");
        System.out.println(str);
        return "succeed";
    }

    /**
     * 把session中的值清除掉
     * [当然了 request中的还是在的啦]
     * @param sessionStatus
     * @return
     */
    @RequestMapping("/deleteSessionAttribute")
    public String deleteSessionAttribute(SessionStatus sessionStatus){
        System.out.println("执行了deleteSessionAttribute方法。。。");
        sessionStatus.setComplete();
        return "succeed";
    }

}
