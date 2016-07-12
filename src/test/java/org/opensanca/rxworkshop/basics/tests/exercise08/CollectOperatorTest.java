package org.opensanca.rxworkshop.basics.tests.exercise08;

import org.assertj.core.api.Condition;
import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise05.ICMCTeachers;
import org.opensanca.rxworkshop.basics.exercise05.TeacherMapper;
import org.opensanca.rxworkshop.basics.exercise05.TeacherStatus;
import org.opensanca.rxworkshop.basics.exercise08.CountHolder;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class CollectOperatorTest {

    @Test public void verifyCollectOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<CountHolder> knightsCount = Observable.from(names)
                .map(TeacherMapper::map)
                .collect(CountHolder::new,
                        (countHolder, teacher) -> {
                            if (teacher.getStatus() == TeacherStatus.KNIGHT) {
                                countHolder.increment();
                            }
                        });

        Condition<CountHolder> expectedKnights = new Condition<CountHolder>() {
            @Override public boolean matches(CountHolder value) {
                return value.get() == 2;
            }
        };

        assertThat(knightsCount)
                .completes()
                .atLeastOneItem(expectedKnights);
    }

}
