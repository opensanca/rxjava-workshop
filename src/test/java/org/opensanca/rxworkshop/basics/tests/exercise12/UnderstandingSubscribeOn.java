package org.opensanca.rxworkshop.basics.tests.exercise12;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.icmc.ICMCTeachers;
import org.opensanca.rxworkshop.basics.util.ThreadUtils;
import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class UnderstandingSubscribeOn {

    @Test public void run() {

        Observable.from(ICMCTeachers.names())
                // TODO apply subscribeOn
                .doOnNext(ThreadUtils::printFromThread)
                .subscribe();

        ThreadUtils.waitForResults(1000);

    }
}
