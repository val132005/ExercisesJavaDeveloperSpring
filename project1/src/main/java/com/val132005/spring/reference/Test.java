package com.val132005.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new  ClassPathXmlApplicationContext("referenceConfig.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);

    }
}
