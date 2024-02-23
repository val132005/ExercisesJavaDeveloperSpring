package com.val132005.spring.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxl = new ClassPathXmlApplicationContext("setConfig.xml");
        CarDealer carDealer = (CarDealer) cxl.getBean("car");
        System.out.println("Name of the car: "+carDealer.getName());
        System.out.println("Models of the car: "+ carDealer.getModels());

    }


}
