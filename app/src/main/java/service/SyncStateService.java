package service;


import pojo.SyncState;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncStateService {

    @GET("/api/get-news/")
    Call<SyncState> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
