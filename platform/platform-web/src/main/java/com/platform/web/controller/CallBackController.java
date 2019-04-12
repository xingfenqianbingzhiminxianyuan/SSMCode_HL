package com.platform.web.controller;

import com.platform.dao.entity.User;
import com.platform.dao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coreServlet")
public class CallBackController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/hello")
    public User questions() {
        return userMapper.selectByPrimaryKey(1);
    }
}
