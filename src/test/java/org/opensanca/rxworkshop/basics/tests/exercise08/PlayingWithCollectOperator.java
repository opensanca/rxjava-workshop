package org.opensanca.rxworkshop.basics.tests.exercise08;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.icmc.ICMCTeachers;
import org.opensanca.rxworkshop.basics.icmc.TeacherMapper;
import org.opensanca.rxworkshop.basics.icmc.TeacherStatus;
import org.opensanca.rxworkshop.basics.util.CountHolder;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithCollectOperator {

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

        Observable<Integer> count = knightsCount.map(CountHolder::get);

        assertThat(count)
                .completes()
                .emits(2);
    }

}
