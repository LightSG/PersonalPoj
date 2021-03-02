package com.sg.dao;/*
@author:
@createTime:
*/


import com.sg.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    //查询用户列表
    List<User> getUserList();

    //查询一个用户
    User getUserById(String id);

    //新增一个用户
    int addUser(User user);

    //更新一个用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(String id);
}
