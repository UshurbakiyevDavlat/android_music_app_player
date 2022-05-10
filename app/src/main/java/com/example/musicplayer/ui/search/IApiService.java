package com.example.musicplayer.ui.search;

import com.example.musicplayer.ui.search.Models.ExampleJson2KtPOJO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IApiService {
    @GET("search")
    Call<ExampleJson2KtPOJO> groupList(@Query("term") String terms);
}
