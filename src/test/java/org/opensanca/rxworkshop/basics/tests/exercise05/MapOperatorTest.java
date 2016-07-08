package org.opensanca.rxworkshop.basics.tests.exercise05;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise05.ICMCTeachers;
import org.opensanca.rxworkshop.basics.exercise05.Teacher;
import org.opensanca.rxworkshop.basics.exercise05.TeacherMapper;
import rx.Observable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class MapOperatorTest {

    @Test public void verifyMapOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<Teacher> teachers = Observable.from(names)
                .map(TeacherMapper::map);

        assertThat(teachers)
                .completes()
                .emissionsCount(names.size());
    }

}
