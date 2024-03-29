package com.example.dalvikmovies.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;
    public static final String API_KEY = "9611ad116cf8e918fd77cfebc08a7c41";
    public static final String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500/";
    public static final String BACKDROP_BASE_URL = "https://image.tmdb.org/t/p/w500/";

    /**
     * This method returns retrofit client instance
     *
     * @return Retrofit object
     */
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

//9611ad116cf8e918fd77cfebc08a7c41