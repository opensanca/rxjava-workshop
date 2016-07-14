package org.opensanca.rxworkshop.basics.starwars.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class Movie {

    public String title;
    @SerializedName("episode_id") public int episode;
    public String director;
    @SerializedName("release_date") public String releaseDay;
    @SerializedName("characters") List<String> caractersResources;

    @Override public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", episode=" + episode +
                ", director='" + director + '\'' +
                ", releaseDay='" + releaseDay + '\'' +
                '}';
    }
}