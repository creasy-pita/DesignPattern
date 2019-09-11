package com.creasypita.learning.designpattern;

/**
 * Created by creasypita on 9/11/2019.
 *
 * @ProjectName: DesignPattern
 */
public class Responder implements HelloListener {
    public void someoneSaidHello() {
        System.out.println(this.getClass().toString() + ": hello what's up");
    }
}
