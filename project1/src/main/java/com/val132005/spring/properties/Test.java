package com.val132005.spring.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxl = new ClassPathXmlApplicationContext("propertiesConfig.xml");
        Country country = (Country) cxl.getBean("countries");
        System.out.println(country);

    }


}
