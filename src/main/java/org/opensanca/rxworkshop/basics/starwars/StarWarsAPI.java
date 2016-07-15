package org.opensanca.rxworkshop.basics.starwars;

import org.opensanca.rxworkshop.basics.starwars.models.Movie;
import org.opensanca.rxworkshop.basics.starwars.payloads.PeopleResults;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public interface StarWarsAPI {

    String URL = "http://swapi.co/api/";

    @GET("people") Observable<PeopleResults> people();

    @GET("films/{movie_id}") Observable<Movie> movieById(
            @Path("movie_id") String id
    );

}
