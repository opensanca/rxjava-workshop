package org.opensanca.rxworkshop.basics.tests.exercise09;

import org.assertj.core.api.Condition;
import org.assertj.core.data.Index;
import org.junit.Test;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class ConcatOperatorTest {

    @Test public void verifyConcatOperator() {
        List<String> sp = Arrays.asList("Corinthians", "Palmeiras", "Santos");
        List<String> rj = Arrays.asList("Flamengo", "Vasco", "Botafogo");

        Observable<String> concatenedTeams =
                Observable.concat(Observable.from(sp), Observable.from(rj));

        assertThat(concatenedTeams).emitsOnIndex(
                new Condition<String>() {
                    @Override public boolean matches(String value) {
                        return value.contentEquals("Flamengo");
                    }
                }, Index.atIndex(3));
    }
}
