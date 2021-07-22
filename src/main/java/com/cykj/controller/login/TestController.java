package com.cykj.controller.login;

import com.cykj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gjw
 * @version 1.0
 * @date 2021/7/21 21:48
 */
@RestController
@RequestMapping("/auth")
public class TestController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("login")
    public String login(@RequestBody String json) {
        System.out.println(json);

        return "";
    }

    @RequestMapping("test")// 测试数据库
    public Integer test() {
        return userService.queryID();
    }


}
