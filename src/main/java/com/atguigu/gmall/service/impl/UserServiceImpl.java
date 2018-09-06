package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 1.让服务提供者注册到注册中心
 *   1) 导入dubbo依赖（2.6.2）\操作zookeeper的客户端（curator）
 *   2）配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * Created by bloom on 2018/9/2.
 */
@Service    //暴露服务
@Component
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1,"北京市海淀区","1","李老师","012313");
        UserAddress address2 = new UserAddress(2,"北京市朝阳区","2","张老师","0142412");

        return Arrays.asList(address1,address2);
    }
}
