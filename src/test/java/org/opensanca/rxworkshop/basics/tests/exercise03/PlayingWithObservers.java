package org.opensanca.rxworkshop.basics.tests.exercise03;

import org.junit.Test;
import rx.Observable;
import rx.Observer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithObservers {

    @Test public void creationWithParameter() {

        Observable<String> create = Observable.fromCallable(() -> "Open Sanca");

        create.subscribe(new Observer<String>() {
            @Override public void onCompleted() {

            }

            @Override public void onError(Throwable e) {

            }

            @Override public void onNext(String s) {
                System.out.println(s);
            }
        });

    }

    @Test public void creationWithCollection() {

        List<String> openSancaFacts = Arrays.asList("Open", "Sanca", "Rules");
        Observable<String> source = Observable.from(openSancaFacts);
        source.subscribe(
                System.out::println,
                Throwable::printStackTrace,
                () -> {
                    // DONE
                }
        );
    }
}
