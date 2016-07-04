package service;


import pojo.SyncSchedule;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncScheduleService {

    @GET("/api/get-news/")
    Call<SyncSchedule> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
