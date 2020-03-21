package top.inson.dubbo.test;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.inson.dubbo.dao.IUsersMapper;
import top.inson.dubbo.entity.Users;
import top.inson.dubbo.service.IUsersService;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringApplication {
    @Autowired
    private DruidDataSource druidDataSource;
    @Autowired
    private IUsersMapper usersMapper;
    @Autowired
    private IUsersService usersService;




    @Test
    public void testDataSource(){
        log.info("druid数据源：" + druidDataSource);

    }

    @Test
    public void testUsersMapper(){
        Users users = usersMapper.selectById(1);
        log.info("users:[{}]", users);
        log.info("json:[{}]", JSON.toJSONString(users));
    }

    @Test
    public void testUsersService(){
        Users users = usersService.getById(1);
        log.info("users：[{}]", users);
    }


}
