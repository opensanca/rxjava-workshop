package org.opensanca.rxworkshop.basics.tests.exercise04;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise04.CreationFromFactoryMethods;
import rx.Observable;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreateFromFactoryMethodsTests {

    @Test public void creationWithRange() {
        Observable<Integer> source = CreationFromFactoryMethods.createAsRange(1, 5);
        assertThat(source).emits(1, 2, 3, 4, 5);
    }

}
