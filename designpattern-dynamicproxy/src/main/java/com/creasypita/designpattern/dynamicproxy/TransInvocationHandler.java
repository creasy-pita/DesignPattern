package com.creasypita.designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransInvocationHandler implements InvocationHandler {
    private Object target;
    public TransInvocationHandler(Object tar){
        this.target= tar;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("the vehicle  begin transaction use ");
        method.invoke(target, args);
        System.out.println("the vehicle  commit transaction use");
        // TODO Auto-generated method stub
        return null;
    }

}