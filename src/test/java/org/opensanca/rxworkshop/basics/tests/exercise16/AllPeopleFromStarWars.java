package org.opensanca.rxworkshop.basics.tests.exercise16;

import org.junit.Test;
import org.opensanca.rxworkshop.basics.starwars.RestApiCreator;
import org.opensanca.rxworkshop.basics.starwars.StarWarsAPI;
import rx.Observable;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class AllPeopleFromStarWars {

    @Test public void find() {

        StarWarsAPI api = RestApiCreator.starWarsAPI();

        api.people()
                .flatMap(payload -> Observable.from(payload.results))
                .subscribe(
                        System.out::println,
                        Throwable::printStackTrace,
                        () -> System.out.println("Done -> All People")
                );
    }
}
