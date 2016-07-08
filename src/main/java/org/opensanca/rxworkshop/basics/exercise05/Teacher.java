package org.opensanca.rxworkshop.basics.exercise05;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class Teacher {

    String name;
    TeacherStatus status;

    public Teacher(String name, TeacherStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public TeacherStatus getStatus() {
        return status;
    }

    @Override public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
