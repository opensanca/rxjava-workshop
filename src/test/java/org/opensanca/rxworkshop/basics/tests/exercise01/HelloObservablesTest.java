package org.opensanca.rxworkshop.basics.tests.exercise01;

import org.junit.Test;
import rx.Observable;
import rx.functions.Action1;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class HelloObservablesTest {

    @Test public void run() {
        Observable.just("Hello", "RxJava")
                .subscribe(new Action1<String>() {
                    @Override public void call(String s) {
                        System.out.println(s);
                    }
                });
    }
}
