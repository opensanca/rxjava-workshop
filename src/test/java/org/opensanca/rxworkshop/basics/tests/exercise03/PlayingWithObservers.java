package org.opensanca.rxworkshop.basics.tests.exercise03;

import org.junit.Test;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithObservers {

    @Test public void consumeWithObservers() {

        Observable<String> create = Observable.fromCallable(() -> "Open Sanca");

        // TODO Consume with observer

    }

    @Test public void consumeWithActions() {

        List<String> openSancaFacts = Arrays.asList("Open", "Sanca", "Rules");
        Observable<String> source = Observable.from(openSancaFacts);

        // TODO Consume with actions

    }
}
