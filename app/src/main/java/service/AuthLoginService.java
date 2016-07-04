package service;


import pojo.AuthLogin;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AuthLoginService {

    @POST("/api/get-news/")
    Call<AuthLogin> getAuth(@Query("email") String email, @Query("password") String password);

}
