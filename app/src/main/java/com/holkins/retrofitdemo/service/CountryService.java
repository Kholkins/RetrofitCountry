package com.holkins.retrofitdemo.service;

import com.holkins.retrofitdemo.Model.CountryInfo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CountryService {

    @GET("country/get/all")
    Call<CountryInfo> getResults();
}
