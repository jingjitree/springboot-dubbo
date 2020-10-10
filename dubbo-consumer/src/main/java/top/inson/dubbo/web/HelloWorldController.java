package top.inson.dubbo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author jingjitree
 * @Date 2020/10/10 13:59
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {


    @GetMapping("/say")
    public String say(){

        return "success";
    }


}
