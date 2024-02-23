package com.val132005.spring.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxl = new ClassPathXmlApplicationContext("mapConfig.xml");
        Costumer costumer = (Costumer) cxl.getBean("costum");
        System.out.println(costumer);
    }
}
