package service;


import pojo.SyncCount;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncCountService {

    @GET("/api/get-news/")
    Call<SyncCount> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
