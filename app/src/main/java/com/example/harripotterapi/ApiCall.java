package com.example.harripotterapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCall {
    @GET("hechizos")
    Call<hechizos> getSearchSpell(@Query("query") String query);
}
