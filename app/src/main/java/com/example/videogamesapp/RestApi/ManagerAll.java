package com.example.videogamesapp.RestApi;

import com.example.videogamesapp.Models.InfoModel;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }

    public Call<List<InfoModel>> comeAllInfo(){
        Call<List<InfoModel>> call = getRestApiClient().comeInfo();
        return call;
    }

    public Call<List<InfoModel>> comeAllDetails(){
        Call<List<InfoModel>> callDetails = getRestApiClient().comeDetails();
        return callDetails;
    }

}
