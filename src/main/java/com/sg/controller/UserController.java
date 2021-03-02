package com.sg.controller;/*
@author:
@createTime:
*/


import com.sg.pojo.User;
import com.sg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //调service层
    @Resource
    private UserService userService;

    //查询全部书籍，并且返回一个书籍展示页面
    @RequestMapping("/allUser")
    public String list(Model model)
    {
        List<User> userList = userService.getUserList();
        model.addAttribute("list",userList);
        return "allUser";
    }
}
