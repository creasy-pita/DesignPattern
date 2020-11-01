package com.creasypita.designpattern.strategy;

import java.lang.management.MonitorInfo;

public class CashRebate extends CashSuper {
    private double moneyDebate = 1d;

    public CashRebate(double moneyDebate) {
        this.moneyDebate = moneyDebate;
    }

    public double acceptCash(double money) {
//        System.out.println("CashRebate");
        return 0;
    }
}
