package org.opensanca.rxworkshop.basics.tests.exercise10;

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

public class UnderstandingFlatMap {

    @Test public void verifyFlatMapOperator() {

        List<String> ZL = Arrays.asList("Itaquera", "Vila Prudente", "Tatuapé");
        List<String> ZS = Arrays.asList("Jardins", "Itaim Bibi", "Jardim Europa");

        Observable<List<String>> neighboors = Observable.just(ZL, ZS);
        Observable<String> flatten = neighboors.flatMap(Observable::from);

        assertThat(flatten).emitsOnIndex(
                new Condition<String>() {
                    @Override public boolean matches(String value) {
                        return value.contentEquals("Tatuapé");
                    }
                }, Index.atIndex(2));
    }

}
