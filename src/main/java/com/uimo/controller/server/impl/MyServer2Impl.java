package com.uimo.controller.server.impl;

import com.uimo.controller.server.MyServer;
import org.springframework.stereotype.Service;

/**
 * com.uimo.controller.server.impl
 *
 * @author UIMO
 * DATE 2022/8/3
 */
@Service(value = "MyService2")
public class MyServer2Impl implements MyServer {
    @Override
    public String getOne() {
        return "uimo,myServer 2 Test1";
    }

    @Override
    public String getTwo() {
        return "uimo,myServer 2 Test2";
    }
}
