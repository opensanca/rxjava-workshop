package org.opensanca.rxworkshop.basics.exercise08;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CountHolder {

    int actual = 0;

    public CountHolder() {
    }

    public void increment() {
        actual++;
    }

    public int get() {
        return actual;
    }
}
