package com.creasypita.designpattern.dynamicproxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    @Test
    public void Test(){
        Vehicle vehicle = new Bike();
        TransInvocationHandler th = new TransInvocationHandler(vehicle);
        Vehicle v = (Vehicle) Proxy.newProxyInstance(vehicle.getClass().getClassLoader()
                , vehicle.getClass().getInterfaces(), th);
        v.run();
        // 保存JDK动态代理生成的代理类，类名保存为 vehicleProxy
//        ProxyUtils.generateClassFile(vehicle.getClass(), "vehicleProxy");
    }
}
