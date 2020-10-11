package top.inson.dubbo.web;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.inson.dubbo.entity.Users;
import top.inson.dubbo.service.IHelloWorldService;
import top.inson.dubbo.service.IUsersService;

/**
 * @ClassName HelloWorldController
 * @Description
 * @Author jingjitree
 * @Date 2020/10/10 13:59
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping(value = "/helloWorld")
public class HelloWorldController {
    @Reference
    private IHelloWorldService helloWorldService;
    @Reference
    private IUsersService usersService;


    @GetMapping("/say")
    public String say(){
        log.info("消费者调用dubbo服务");
        String content = helloWorldService.sayHello("你好世界");
        log.info("content:" + content);
        Users users = usersService.getById(1);
        log.info("users:{}", JSON.toJSONString(users));
        return "success";
    }


}
