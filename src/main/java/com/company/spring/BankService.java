package com.company.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BankService {
    @Autowired
    private PaymentSystem paymentSystem;

    public BankService() {

        System.out.println("Bank created ");
    }
    @PostConstruct
    public void init() {
        paymentSystem.setupData();
    }
    @PreDestroy
    public void close() {
        System.out.println("END");
    }

    //    private PaymentSystem paymentSystem;
//
//    public BankService(PaymentSystem paymentSystem) {
//        this.paymentSystem = paymentSystem;
//    }
//
//    public void makePayment() {
//        System.out.println("payment");
//        paymentSystem.successPayment();
//    }
}
