package org.opensanca.rxworkshop.basics.tests.exercise11;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.exercise05.ICMCDepartment;
import org.opensanca.rxworkshop.basics.exercise05.ICMCTeachers;
import org.opensanca.rxworkshop.basics.exercise05.Teacher;
import org.opensanca.rxworkshop.basics.exercise05.TeacherMapper;
import rx.Observable;
import rx.observables.GroupedObservable;

import java.util.Set;

import static br.ufs.github.rxassertions.RxAssertions.assertThat;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class GroupByOperatorTest {

    @Test public void verifyGroupByOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<Teacher> teachers =
                Observable.from(names).map(TeacherMapper::map);

        Observable<GroupedObservable<ICMCDepartment, Teacher>> groups =
                teachers.groupBy(Teacher::getDepartment);

        Observable<Teacher> onSSC = groups.flatMap(group ->
                ((group.getKey() == ICMCDepartment.SSC)) ?
                        group.asObservable() : Observable.empty());

        assertThat(onSSC).completes().emissionsCount(1);

    }
}
