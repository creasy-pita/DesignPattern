package com.creasypita.learning.designpattern;

/**
 * Created by creasypita on 9/11/2019.
 *
 * @ProjectName: DesignPattern
 */
public class Main {
    public static void main(String[] args) {
        Initiater initiater = new Initiater();
        initiater.addListener(new Responder());
        initiater.sayHello();
    }

}
