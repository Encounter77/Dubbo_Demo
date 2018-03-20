package com.ex.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "dubbo-provider.xml"});
        context.start();
        try {
            Thread.sleep(2000000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
