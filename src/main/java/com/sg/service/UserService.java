package com.sg.service;/*
@author:
@createTime:
*/
import com.sg.pojo.User;
import org.springframework.stereotype.Service;


import java.util.List;


public interface UserService {
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
