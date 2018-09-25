package com.tohananews.tohana.tohananews;
import com.tohananews.tohana.tohananews.models.TohanaNewsModel;



import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "http://newsexpress4u.com/api/";

    @GET("news")
    Call<TohanaNewsModel> getNews();

}
