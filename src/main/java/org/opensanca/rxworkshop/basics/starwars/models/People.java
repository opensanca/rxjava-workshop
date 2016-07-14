package org.opensanca.rxworkshop.basics.starwars.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class People {

    public String name;
    public String gender;
    @SerializedName("films") public List<String> filmsResources;

    @Override public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
