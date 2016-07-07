package org.opensanca.rxworkshop.basics.tests.exercise03;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise03.CreationAsStatic;
import rx.Observable;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationFromStaticTest {

    @Test public void withAssertions() {

        String parameter = "Open Sanca";
        Observable<String> create = CreationAsStatic.create(parameter);
        assertThat(create).emits(parameter);

    }
}
