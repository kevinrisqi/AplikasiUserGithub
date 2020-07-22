package com.zenai.aplikasiusergithub.api;

import com.zenai.aplikasiusergithub.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndPoint {

    @GET(Api.END_POINT_LOCATION)
    Call<User> getData();

}
