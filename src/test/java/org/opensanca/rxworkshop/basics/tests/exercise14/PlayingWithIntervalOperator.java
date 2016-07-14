package org.opensanca.rxworkshop.basics.tests.exercise14;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.util.ThreadUtils;
import rx.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithIntervalOperator {

    @Test public void run() {
        Observable.interval(100, TimeUnit.MILLISECONDS)
                .subscribe(ThreadUtils::printFromThread);

        ThreadUtils.waitForResults(5000);

    }
}
