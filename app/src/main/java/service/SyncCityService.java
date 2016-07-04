package service;


import pojo.SyncCity;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncCityService {

    @GET("/api/get-news/")
    Call<SyncCity> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
