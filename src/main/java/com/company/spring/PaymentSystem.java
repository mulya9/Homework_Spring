package com.company.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class PaymentSystem {
    public PaymentSystem() {
        System.out.println("Payment system bean created");
    }

    //    public void successPayment() {
//        System.out.println("OK");
//    }
    public void setupData() {
        System.out.println("Data setup ");
    }
}
