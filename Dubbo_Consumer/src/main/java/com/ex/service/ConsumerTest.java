package com.ex.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "dubbo-consumer.xml");
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService.show());
        try {
            Thread.sleep(2000000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
