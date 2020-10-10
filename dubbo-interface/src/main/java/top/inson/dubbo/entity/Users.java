package top.inson.dubbo.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName(value = "users")
public class Users extends BaseEntity<Users> implements java.io.Serializable{

    private String username;
    private String password;
    private String account;
    private Integer sex;
    private String phone;
    private String address;
    private String idCard;

}
