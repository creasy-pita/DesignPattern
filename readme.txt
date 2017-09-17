2017-9-17
增加抽象工厂模式代码，
改进： 客户端需要通过依赖反转来去除依赖

1 handler 去使用被代理类， 所以可以采用在 handler的constructor 传入被代理类的实例
2 动态代理类使用handler ， 所以可以采用在 动态代理类的constructor 传入被代理类的实例