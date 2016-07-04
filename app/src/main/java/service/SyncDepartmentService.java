package service;


import pojo.SyncDepartment;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncDepartmentService {

    @GET("/api/get-news/")
    Call<SyncDepartment> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
