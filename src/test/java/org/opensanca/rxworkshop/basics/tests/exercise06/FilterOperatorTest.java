package org.opensanca.rxworkshop.basics.tests.exercise06;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise05.ICMCTeachers;
import org.opensanca.rxworkshop.basics.exercise05.Teacher;
import org.opensanca.rxworkshop.basics.exercise05.TeacherMapper;
import org.opensanca.rxworkshop.basics.exercise05.TeacherStatus;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class FilterOperatorTest {

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
