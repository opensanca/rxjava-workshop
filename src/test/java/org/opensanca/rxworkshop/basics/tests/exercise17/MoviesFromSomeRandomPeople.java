package org.opensanca.rxworkshop.basics.tests.exercise17;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.starwars.ResourceIdExtractor;
import org.opensanca.rxworkshop.basics.starwars.RestApiCreator;
import org.opensanca.rxworkshop.basics.starwars.StarWarsAPI;
import org.opensanca.rxworkshop.basics.starwars.models.Movie;
import org.opensanca.rxworkshop.basics.starwars.models.People;
import rx.Observable;
import rx.schedulers.Schedulers;

import java.util.List;
import java.util.Random;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class MoviesFromSomeRandomPeople {

    @Test public void find() {

        StarWarsAPI api = RestApiCreator.starWarsAPI();

        api.people()
                .subscribeOn(Schedulers.io())
                .flatMap(payload -> selectRandomPeople(payload.results))
                .doOnNext(System.out::println)
                .flatMap(people -> Observable.from(people.filmsResources))
                .flatMap(filmUrl -> queryMovieFromPeople(api, filmUrl))
                .subscribe(System.out::println);
    }

    private Observable<Movie> queryMovieFromPeople(StarWarsAPI api, String filmUrl) {
        String id = ResourceIdExtractor.idFromUrl(filmUrl);
        return api.movieById(id);
    }

    private Observable<People> selectRandomPeople(List<People> peoples) {
        final Random randomizer = new Random();
        final int random = randomizer.nextInt(peoples.size());
        return Observable.just(peoples.get(random));
    }
}
