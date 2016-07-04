package service;


import pojo.SyncAppointment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncAppointmentService {

    @GET("/api/get-news/")
    Call<SyncAppointment> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
