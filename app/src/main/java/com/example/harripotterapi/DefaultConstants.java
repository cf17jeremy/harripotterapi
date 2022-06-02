package com.example.harripotterapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DefaultConstants {
    public static final String API_KEY = "835babac7f4d7e37f8f51a1abac4fe63";
    public static final String SESSION_ID = "d5b00193fad0c12ce51ff61af7ef939be3be5023";
    public static final String ACCOUNT_ID = "cf17jeremy";
    public static final String BASE_IMG_URL = "https://image.tmdb.org/t/p/w500/";

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://fedeperin-harry-potter-api.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
