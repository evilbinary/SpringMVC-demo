package org.evilibnary.controller;

import org.evilibnary.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 作者:evilbinary on 3/25/16.
 * 邮箱:rootdebug@163.com
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm() {
        return "adminLogin";
    }

    @ExceptionHandler({Exception.class})
    public String exception(Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        return "exception";
    }

    @RequestMapping("/throw")
    public void test() throws Exception {
        throw new Exception("出错了！");
    }

}
