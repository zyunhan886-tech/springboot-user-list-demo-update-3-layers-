package com.yunhan.springbootweb01.controller;

import cn.hutool.core.io.IoUtil;
import com.yunhan.springbootweb01.pojo.User;
import com.yunhan.springbootweb01.service.UserService;
import com.yunhan.springbootweb01.service.impl.UserServiceImpl;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private UserService userService = new UserServiceImpl();

    @RequestMapping("/list")
    public List<User> list() throws Exception{
        // 1. 调用 service，获取数据
        List<User> userList = userService.findAll();

        // 2. 返回数据（json）
        return userList;

    }
}
