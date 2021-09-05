package com.example.retrofit2_lyold_video;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    /*** do not write query this will not work in  get but write before question Mark****/
    /** Here we are writing query because we have query in the api call and inside the query write same id if do not write than it will not work**/
    @GET("/comments")
    Call<List<ResponseModel>> getPosts(@Query("postId") int postId);
}
