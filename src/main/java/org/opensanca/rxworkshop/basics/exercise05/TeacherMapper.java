package org.opensanca.rxworkshop.basics.exercise05;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class TeacherMapper {

    public static Teacher map(String name) {
        TeacherStatus status = mappedStatus(name);
        Teacher t = new Teacher(name, status);
        System.out.println(t.toString());
        return t;
    }

    private static TeacherStatus mappedStatus(String name) {

        if (name.contains("Elaine")) return TeacherStatus.KNIGHT;
        if (name.contains("Janete")) return TeacherStatus.KNIGHT;
        if (name.contains("Paulo Sérgio")) return TeacherStatus.HARD;
        if (name.contains("Sandra")) return TeacherStatus.HARD;

        return TeacherStatus.EASY;
    }
}
