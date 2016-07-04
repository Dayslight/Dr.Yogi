package service;


import pojo.UserInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserInfoService {

    @GET("/api/get-news/")
    Call<UserInfo> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
