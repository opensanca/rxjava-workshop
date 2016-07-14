package org.opensanca.rxworkshop.basics.util;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class ThreadUtils {

    public static void waitForResults(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printFromThread(long l) {
        printFromThread(String.valueOf(l));
    }

    public static void printFromThread(int k) {
        printFromThread(String.valueOf(k));
    }

    public static void printFromThread(String s) {
        System.out.println("a :" + s
                + " -> at thread : " + Thread.currentThread().getName());
    }
}
