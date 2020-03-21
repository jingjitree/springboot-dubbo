package top.inson.dubbo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;
import top.inson.dubbo.dao.IUsersMapper;
import top.inson.dubbo.entity.Users;
import top.inson.dubbo.service.IUsersService;

@Service(version = "${dubbo.version}")
public class UsersServiceImpl extends ServiceImpl<IUsersMapper, Users> implements IUsersService {

}
