package com.uimo.controller.server.impl;

import com.uimo.controller.server.MyServer;
import org.springframework.stereotype.Service;

/**
 * com.uimo.controller.server.impl
 *
 * @author UIMO
 * DATE 2022/8/3
 */
@Service(value = "MyService1")
public class MyServerImpl implements MyServer {

    @Override
    public String getOne() {
        return "uimo,one";
    }

    @Override
    public String getTwo() {
        return "uimo.two";
    }

}
