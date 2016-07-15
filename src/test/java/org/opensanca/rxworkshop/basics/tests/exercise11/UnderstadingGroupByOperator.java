package org.opensanca.rxworkshop.basics.tests.exercise11;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.icmc.ICMCTeachers;
import org.opensanca.rxworkshop.basics.icmc.Teacher;
import org.opensanca.rxworkshop.basics.icmc.TeacherMapper;
import rx.Observable;

import java.util.Set;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class UnderstadingGroupByOperator {

    @Test public void verifyGroupByOperatorBehavior() {
        Set<String> names = ICMCTeachers.names();

        Observable<Teacher> teachers =
                Observable.from(names).map(TeacherMapper::map);

        // TODO apply groupBy; assert emissions on desired group


    }
}
