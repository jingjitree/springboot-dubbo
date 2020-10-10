package top.inson.dubbo.comp;

import jdk.nashorn.internal.ir.annotations.Reference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.inson.dubbo.service.IHelloWorldService;

/**
 * @ClassName HelloWorldServiceComponent
 * @Description
 * @Author jingjitree
 * @Date 2020/10/10 10:59
 * @Version 1.0
 **/
@Slf4j
@Component
public class HelloWorldServiceComponent implements IHelloWorldService {
    @Reference
    private IHelloWorldService helloWorldService;


    @Override
    public String sayHello(String username) {
        String msg = username + ":消费者say hello";
        log.info("消费者打印：" + msg);
        return helloWorldService.sayHello(msg);
    }

}
