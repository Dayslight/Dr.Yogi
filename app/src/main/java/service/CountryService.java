package service;

import pojo.Country;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by bijay on 7/4/16.
 */
public interface CountryService {

    @GET("/api/get-news/")
    Call<Country> getCountry(@Query("Accept") String Accept, @Query("Authorization") String Authorization);
}
