package org.opensanca.rxworkshop.basics.exercise02;

import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationFromCallable {

    public void createAndPrint() {
        Observable.fromCallable(() -> "From Callable")
                .subscribe(System.out::println);
    }
}
