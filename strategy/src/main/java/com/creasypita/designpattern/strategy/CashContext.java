package com.creasypita.designpattern.strategy;

public class CashContext {
    CashSuper cs ;

    public CashContext(String type){
        switch (type)
        {
            case "正常收费":
                cs = new CashNormal();
                break;
                // 满300减100 与 满500减150属于同一类算法 CashReturn
            case "满300减100":
                cs = new CashReturn(300, 100);
                break;
            case "满500减150":
                cs = new CashReturn(500, 150);
                break;
            case "打6折":
                cs = new CashRebate(0.6);
                break;
            default:
                cs = new CashNormal();
        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}
