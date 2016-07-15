package org.opensanca.rxworkshop.basics.tests.exercise15;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithMergeOperator {

    @Test public void verifyMergeOperator() {

        List<String> sp = Arrays.asList("Corinthians", "Palmeiras", "Santos");
        List<String> rj = Arrays.asList("Flamengo", "Vasco", "Botafogo");

        // TODO
        // Create observable sequence that prints SP teams at random intervals
        // Create observable sequence that prints RJ teams at random intervals
        // Apply merge to these sequences

    }

    private void printAndSleep(String s) {
        System.out.println(s);
        randomSleep();
    }

    private void randomSleep() {
        int randomWaiting = 3;
        Random random = new Random();
        long randomTime = (random.nextInt(randomWaiting)) * 1000;
        try {
            Thread.sleep(randomTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
