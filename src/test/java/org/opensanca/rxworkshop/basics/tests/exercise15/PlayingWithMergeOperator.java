package org.opensanca.rxworkshop.basics.tests.exercise15;

import org.junit.Test;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithMergeOperator {

    @Test public void verifyMergeOperator() {

        List<String> sp = Arrays.asList("Corinthians", "Palmeiras", "Santos");
        List<String> rj = Arrays.asList("Flamengo", "Vasco", "Botafogo");

        Observable<String> merged = Observable.merge(
                Observable.from(sp)
                        .subscribeOn(Schedulers.computation())
                        .doOnNext(this::printAndSleep),
                Observable.from(rj)
                        .subscribeOn(Schedulers.io())
                        .doOnNext(this::printAndSleep)
        );

        assertThat(merged).completes();

    }

    private void printAndSleep(String s) {
        System.out.println(s);
        randomSleep();
    }

    private void randomSleep() {
        Random random = new Random();
        long randomTime = (random.nextInt(3) + 1) * 1000;
        try {
            Thread.sleep(randomTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
