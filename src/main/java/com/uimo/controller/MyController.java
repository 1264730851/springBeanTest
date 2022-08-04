package com.uimo.controller;

import com.uimo.controller.server.MyServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * com.uimo.controller
 *
 * @author UIMO
 * DATE 2022/8/3
 */
@RestController
public class MyController {

    @Resource(name = "MyService2")
    private MyServer myServer;

    @GetMapping("/test1")
    public String test1() {
        return "uimo," + myServer.getOne();
    }

    @GetMapping("/test2")
    public String test2() {
        return "uimo,test2" + myServer.getTwo();
    }
}
