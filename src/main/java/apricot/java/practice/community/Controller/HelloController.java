package apricot.java.practice.community.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//将其识别为spring的一个bean，@controller收请求、处理请求，并返回响应
@Controller
public class HelloController {

    @GetMapping("/hello")
//    @RequestParam为请求参数
    public String hello(@RequestParam(name = "name" ) String name, Model model){
        model.addAttribute("name",name);
//        在模板templates里面找到hello.html的文件，然后返回
        return "hello";

    }
}
