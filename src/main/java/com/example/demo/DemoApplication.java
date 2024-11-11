package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // 启动spring容器，运行springboot
    public static void main(String[] args) {
        // 运行springboot项目，启动spring容器
        SpringApplication.run(DemoApplication.class, args);
//        var ctx = SpringApplication.run(DemoApplication.class, args);

        // 获取容器中的控制器组件
//        System.out.println(ctx.getBean("bookController"));

        //获取容器中的spring MVC的核心控制器组件
//        System.out.println(ctx.getBean("dispatcherServlet"));

        //获取容器中的spring MVC的视图解析器组件（json、xml的视图响应）
//        System.out.println(ctx.getBean("viewResolver"));

        //获取容器中的spring MVC的视图解析器组件（jsp的视图响应）
//        System.out.println(ctx.getBean("defaultViewResolver"));

        /*
         * 三目运算符的一般形式为：条件表达式 ? 真值表达式 : 假值表达式
         */
//        for (var name: ctx.getBeanDefinitionNames()) {
//            System.out.println("预定义：" + (name.contentEquals("bookController") ? "是->" + name : name));
//        }


    }

}
