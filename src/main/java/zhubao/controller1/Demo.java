package zhubao.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2020/6/22.
 */
@Controller
public class Demo {

    @RequestMapping("/demo")
    public String demo(){
        System.out.print("hello");
        return "/go";
    }


    @RequestMapping("/user/{userId}")  // 请求url地址映射
    public String userinfo(Model model, @PathVariable("userId") int userId, HttpSession session) {
        System.out.println("进入  userinfo  页面");
        //判断是否有用户登录
     return "zhubao"+userId;
    }

}
