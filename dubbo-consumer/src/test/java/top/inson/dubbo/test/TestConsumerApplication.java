package top.inson.dubbo.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.inson.dubbo.service.IHelloWorldService;

/**
 * @ClassName TestConsumerApplication
 * @Description
 * @Author jingjitree
 * @Date 2020/10/10 13:48
 * @Version 1.0
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestConsumerApplication {
    @Autowired
    private IHelloWorldService helloWorldService;


    @Test
    public void testDubbo(){
        log.info("spring获取的对象：" + helloWorldService);
        helloWorldService.sayHello("你好");

    }



}
