package net.togogo.mapper;

import net.togogo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/*@Component*/
public interface UserMapper {

    void userAdd(User user);
}
