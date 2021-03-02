package com.sg.service;/*
@author:
@createTime:
*/


import com.sg.dao.UserMapper;
import com.sg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    //依赖注入：创建对象时由第三方帮你提供依赖
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public int deleteUser(String id) {
        return userMapper.deleteUser(id);
    }


}
