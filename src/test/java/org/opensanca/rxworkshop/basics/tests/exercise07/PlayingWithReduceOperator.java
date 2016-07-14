package org.opensanca.rxworkshop.basics.tests.exercise07;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.icmc.ICMCTeachers;
import org.opensanca.rxworkshop.basics.icmc.TeacherMapper;
import org.opensanca.rxworkshop.basics.icmc.TeacherStatus;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithReduceOperator {

    @Test public void verifyReduceOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<Integer> knightsCount = Observable.from(names)
                .map(TeacherMapper::map)
                .reduce(0, (accumulator, teacher) ->
                        teacher.getStatus() == TeacherStatus.KNIGHT ? ++accumulator : accumulator
                );

        assertThat(knightsCount)
                .completes()
                .emits(2);
    }
}
