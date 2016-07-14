package org.opensanca.rxworkshop.basics.exercise05;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public enum ICMCDepartment {

    SMA("Matemática Pura"),
    SME("Matemática Aplicada e Estatística"),
    SCC("Ciências de Computação"),
    SSC("Sistemas de Computação");

    private String name;

    ICMCDepartment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
