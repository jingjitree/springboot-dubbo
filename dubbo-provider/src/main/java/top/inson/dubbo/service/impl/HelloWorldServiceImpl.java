package top.inson.dubbo.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import top.inson.dubbo.service.IHelloWorldService;

/**
 * @ClassName HelloWorldServiceImpl
 * @Description
 * @Author jingjitree
 * @Date 2020/10/10 10:51
 * @Version 1.0
 **/
@Slf4j
@Service(version = "${dubbo.version}")
public class HelloWorldServiceImpl implements IHelloWorldService {

    @Override
    public String sayHello(String username) {
        String msg = username + ":生产者say hello";
        log.info("生产者打印：" + msg);
        return msg;
    }

}
