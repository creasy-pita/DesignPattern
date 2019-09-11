package com.creasypita.learning.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by creasypita on 9/11/2019.
 *
 * @ProjectName: DesignPattern
 */
public class Initiater {
    private List<HelloListener> listeners = new ArrayList<HelloListener>();

    public void addListener(HelloListener toAdd) {
        listeners.add(toAdd);
    }

    public void sayHello() {
        System.out.println("Hello!!");

        // Notify everybody that may be interested.
        for (HelloListener hl : listeners)
            hl.someoneSaidHello();
    }
}
