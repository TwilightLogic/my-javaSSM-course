package com.itheima;

// 用静态工厂类来进行bean的实例化
public class MyBean2Factory {
    public static Bean2 createBean() {
        // 这里其实就创建了Bean2的实例
        return new Bean2();
    }
}
