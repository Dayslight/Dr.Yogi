package service;


import pojo.SyncCountry;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncCountryService {

    @GET("/api/get-news/")
    Call<SyncCountry> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
