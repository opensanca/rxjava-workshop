package org.opensanca.rxworkshop.basics.tests.exercise13;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.util.ThreadUtils;
import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class UnderstandingObserveOn {

    @Test public void run() {

        Observable.range(1, 5)
                // TODO apply observeOn
                .doOnNext(integer -> ThreadUtils.printFromThread(integer * 2))
                // TODO apply observeOn
                .doOnNext(integer -> ThreadUtils.printFromThread(integer * 10))
                .subscribe();

        ThreadUtils.waitForResults(1000);
    }

}