package org.opensanca.rxworkshop.basics.tests.exercise06;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.icmc.ICMCTeachers;
import org.opensanca.rxworkshop.basics.icmc.Teacher;
import org.opensanca.rxworkshop.basics.icmc.TeacherMapper;
import org.opensanca.rxworkshop.basics.icmc.TeacherStatus;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class PlayingWithFilterOperator {

    @Test public void verifyFilterOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<Teacher> teachers = Observable.from(names)
                .map(TeacherMapper::map)
                .filter(teacher -> teacher.getStatus() == TeacherStatus.KNIGHT);

        assertThat(teachers)
                .completes()
                .emissionsCount(1);
    }
}
