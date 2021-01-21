package com.example.videogamesapp.RestApi;

public class BaseManager {

    protected RestApi getRestApiClient(){
        RestApiClient restApiClient = new RestApiClient(BaseUrl.baseURL);
        return restApiClient.getmRestApi();
    }

}
