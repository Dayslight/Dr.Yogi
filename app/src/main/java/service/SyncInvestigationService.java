package service;


import pojo.SyncInvestigation;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncInvestigationService {

    @GET("/api/get-news/")
    Call<SyncInvestigation> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
