package com.poicc.netty.demo.web;

import com.poicc.netty.demo.server.NettyServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: crq
 * @create: 2021-11-02 23:21
 **/
@RestController
@RequestMapping(value = "/server")
public class NettyController {
    @Resource
    private NettyServer nettyServer;

    @GetMapping("/address")
    public String localAddress() {
        return "Netty Server local Address：" + nettyServer.getChannel().localAddress();
    }

    @GetMapping("/open")
    public String isOpen() {
        return "Netty Server isOpen？" + nettyServer.getChannel().isOpen();
    }
}
