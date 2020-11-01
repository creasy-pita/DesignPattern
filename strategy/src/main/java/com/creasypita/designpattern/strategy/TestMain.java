package com.creasypita.designpattern.strategy;

public class TestMain {
    public static void main(String[] args) {
        String item = "满300减100";
        CashContext cashContext = new CashContext(item);
        System.out.println(cashContext.GetResult(400));
        System.out.println(cashContext.GetResult(310));
    }
}
