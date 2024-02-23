package com.val132005.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("listConfig.xml");
        Hospital hosp = (Hospital) ctx.getBean("hospital");
        System.out.println("Name of Hospital: "+hosp.getName());

        System.out.println("Departments of Hospital: "+hosp.getDepartments());
    }
}
