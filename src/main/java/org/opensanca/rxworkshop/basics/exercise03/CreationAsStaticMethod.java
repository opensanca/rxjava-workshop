package org.opensanca.rxworkshop.basics.exercise03;

import rx.Observable;

import java.util.Collection;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationAsStaticMethod {

    public static Observable<String> fromParameter(String deferred) {
        return Observable.fromCallable(() -> deferred);
    }

    public static Observable<String> fromCollection(Collection<String> collection) {
        return Observable.from(collection);
    }

}
