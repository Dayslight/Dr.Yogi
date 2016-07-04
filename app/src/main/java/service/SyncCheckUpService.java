package service;


import pojo.SyncCheckUp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncCheckUpService {

    @GET("/api/get-news/")
    Call<SyncCheckUp> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
