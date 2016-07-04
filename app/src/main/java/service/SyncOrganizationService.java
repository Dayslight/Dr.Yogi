package service;


import pojo.SyncOrganization;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SyncOrganizationService {

    @GET("/api/get-news/")
    Call<SyncOrganization> getNews(@Query("mobile") String mobile, @Query("token") String token, @Query("page") String page);

}
