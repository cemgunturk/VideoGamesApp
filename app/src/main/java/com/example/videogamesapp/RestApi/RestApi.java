package com.example.videogamesapp.RestApi;

import com.example.videogamesapp.Models.InfoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    @GET("/games/key=58434723f6msh4fff54939c8d698p1227aejsne26a37e332d8")
    Call<List<InfoModel>> comeInfo();

    @GET("/games/%7Bgame_pk%7D")
    Call<List<InfoModel>> comeDetails();

}
