package org.opensanca.rxworkshop.basics.tests.exercise03;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise03.CreationAsStaticMethod;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CreationFromStaticTest {

    @Test public void creationWithParameter() {

        String parameter = "Open Sanca";
        Observable<String> create = CreationAsStaticMethod.fromParameter(parameter);
        assertThat(create).emits(parameter);

    }

    @Test public void creationWithCollection() {

        List<String> openSancaFacts = Arrays.asList("Open", "Sanca", "Rules");

        assertThat(CreationAsStaticMethod.fromCollection(openSancaFacts))
                .expectedValues(openSancaFacts);

    }
}
