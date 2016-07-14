package org.opensanca.rxworkshop.basics.exercise05;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class Teacher {

    String name;
    ICMCDepartment department;
    TeacherStatus status;

    public Teacher(String name, ICMCDepartment department, TeacherStatus status) {
        this.name = name;
        this.department = department;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public ICMCDepartment getDepartment() {
        return department;
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
