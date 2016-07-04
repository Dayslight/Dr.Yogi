package service;


import pojo.SignUp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SignupService {

    @GET("/api/get-news/")
    Call<SignUp> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
