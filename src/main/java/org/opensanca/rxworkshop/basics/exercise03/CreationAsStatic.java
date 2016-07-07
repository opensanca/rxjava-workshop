package org.opensanca.rxworkshop.basics.exercise03;

import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationAsStatic {

    public static Observable<String> create(String deferred) {
        return Observable.fromCallable(() -> deferred);
    }

}
