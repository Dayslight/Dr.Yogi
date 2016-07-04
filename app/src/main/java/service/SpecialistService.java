package service;


import pojo.Specialist;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SpecialistService {

    @GET("/api/get-news/")
    Call<Specialist> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
