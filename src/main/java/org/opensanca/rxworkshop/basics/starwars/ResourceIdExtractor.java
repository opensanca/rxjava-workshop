package org.opensanca.rxworkshop.basics.starwars;

import okhttp3.HttpUrl;
import rx.Observable;

import java.util.List;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class ResourceIdExtractor {

    // http://swapi.co/api/people/1/

    public static String idFromUrl(String url) {

        List<String> segments = HttpUrl.parse(url).encodedPathSegments();
        return Observable.from(segments)
                .filter(s -> s != null && s.length() == 1)
                .last()
                .toBlocking()
                .single();
    }

}