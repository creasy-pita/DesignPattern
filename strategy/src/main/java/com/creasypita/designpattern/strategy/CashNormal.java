package com.creasypita.designpattern.strategy;

public class CashNormal extends CashSuper {
    public double acceptCash(double money) {
//        System.out.println("CashNormal");
        return money;
    }
}
