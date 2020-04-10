package com.example.restapi2.retrofit;

import com.example.restapi2.model.Person;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("safepeople")
    Call<List<Person>> getPeople();
}
