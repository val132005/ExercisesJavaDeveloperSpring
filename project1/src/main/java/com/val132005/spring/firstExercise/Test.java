package com.val132005.spring.firstExercise;

import com.val132005.spring.firstExercise.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee)  ctx.getBean("emp");
        System.out.println("Employee ID: "+emp.getId());
        System.out.println("Employ name:"+ emp.getName() );
    }
}
