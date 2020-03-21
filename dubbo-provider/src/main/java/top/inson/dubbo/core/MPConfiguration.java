package top.inson.dubbo.core;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "top.inson.dubbo.dao")
public class MPConfiguration {
}
