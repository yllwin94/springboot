package com.example.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test01Application {

    //SpringApplication类的run方法
    //运行spring boot项目，启动spring容器
    public static void main(String[] args) {
        SpringApplication.run(Test01Application.class, args);

        // 运行spring boot项目；启动spring容器
//        var ctx = SpringApplication.run(Test01Application.class, args);
        //获取容器中的控制器组件
//        System.out.println(ctx.getBean("bookController"));
        // 获取容器中的spring MVC的核心控制器
//        System.out.println(ctx.getBean("dispatcherServlet"));

//        System.out.println(ctx.getBean("viewResolver"));
//        System.out.println(ctx.getBean("defaultViewResolver"));

//        for (var name: ctx.getBeanDefinitionNames()
//             ) {
//            System.out.println("预定义：" + name);
//        }
    }

}
