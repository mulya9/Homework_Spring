package com.company.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
       // Car car = (Car) context.getBean("bankService");
       // car.start();
       BankService bean = context.getBean(BankService.class);
       // bean.makePayment();
     //   context.getBean(PaymentSystem.class);
    }
}
