package org.opensanca.rxworkshop.basics.tests.exercise04;

import org.junit.Test;
import rx.Observable;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationFromFactoryMethod {

    @Test public void creationWithRange() {
        Observable<Integer> source = Observable.range(1, 5);
        assertThat(source).emits(1, 2, 3, 4, 5);
    }

}
