package org.opensanca.rxworkshop.basics.tests.exercise12;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.commom.ThreadUtils;
import org.opensanca.rxworkshop.basics.exercise05.ICMCTeachers;
import rx.Observable;
import rx.schedulers.Schedulers;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class UnderstandingSubscribeOn {

    @Test public void run() {

        Observable.from(ICMCTeachers.names())
                .subscribeOn(Schedulers.computation())
                .doOnNext(ThreadUtils::printFromThread)
                .subscribe();

        ThreadUtils.sleep(1000);

    }
}
