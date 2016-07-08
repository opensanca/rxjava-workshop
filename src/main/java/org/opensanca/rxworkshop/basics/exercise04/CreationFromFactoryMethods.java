package org.opensanca.rxworkshop.basics.exercise04;

import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationFromFactoryMethods {

    public static Observable<Integer> createAsRange(int lower, int upper) {
        return Observable.range(lower, upper);
    }

}
