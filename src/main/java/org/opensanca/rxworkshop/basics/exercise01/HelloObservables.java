package org.opensanca.rxworkshop.basics.exercise01;

import rx.Observable;
import rx.functions.Action1;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class HelloObservables {

    public void helloRxJava() {
        Observable.just("Hello", "RxJava")
                .subscribe(new Action1<String>() {
                    @Override public void call(String s) {
                        System.out.println(s);
                    }
                });
    }

}
