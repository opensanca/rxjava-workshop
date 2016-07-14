package org.opensanca.rxworkshop.basics.tests.exercise14;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.commom.ThreadUtils;
import rx.Observable;

import java.util.concurrent.TimeUnit;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class InvervalOperatorBehaviour {

    @Test public void run() {
        Observable.interval(100, TimeUnit.MILLISECONDS)
                .subscribe(ThreadUtils::printFromThread);

        ThreadUtils.sleep(5000);

    }
}
