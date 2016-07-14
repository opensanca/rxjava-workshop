package org.opensanca.rxworkshop.basics.starwars;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ubiratansoares for RxJava Workshop.
 */

public class RestApiCreator {

    public static StarWarsAPI starWarsAPI() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(StarWarsAPI.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit.create(StarWarsAPI.class);
    }

}
