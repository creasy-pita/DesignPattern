# design pattern implement with java 

## 2020年8月23日

- 修改动态代理模式，见 module:designpattern-dynamicproxy
- 增加动态代理类的class文件输出，
- 参考 [Java 动态代理详解](https://juejin.im/post/6844903744954433544#heading-7)   ;[细说JDK动态代理的实现原理](https://blog.csdn.net/mhmyqn/article/details/48474815#)

- 如下描述java动态代理中增加Spring AOP提供的各种拦截该如何实现

```java
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // BeforeAdvice
        Object retVal = null;
        try {
            // AroundAdvice
            retVal = method.invoke(target, args);
            // AroundAdvice
            // AfterReturningAdvice
        }
        catch (Throwable e) {
            // AfterThrowingAdvice
        }
        finally {
            // AfterAdvice
        }
        return retVal;
    }
```


## 2019-09-11

增加观察者模式

## 2017-9-20

增加责任链模式
概念：当客户端提交请求，请求以链方式传递直至一个责任对象去负责处理
特点：发送者与接收者 没有对方的明确信息， 接收者之前可以很方便的创建相互的连接并处理发送者的请求

## 2017-9-17

增加简单工厂  ， 用简单工厂封装抽象工厂的方式,减少客户端  变动工厂时（比如从SqlFactory-> OracleFactory）的修改量

## 2017-9-17

增加抽象工厂模式代码，
改进： 客户端需要通过依赖反转来去除依赖

1 handler 去使用被代理类， 所以可以采用在 handler的constructor 传入被代理类的实例
2 动态代理类使用handler ， 所以可以采用在 动态代理类的constructor 传入被代理类的实例