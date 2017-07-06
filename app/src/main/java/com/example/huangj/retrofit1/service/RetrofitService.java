package com.example.huangj.retrofit1.service;

import com.example.huangj.retrofit1.entity.HomeEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Administrator on 2016/12/16.15:02
 */

public interface RetrofitService{
    @GET
    Call<HomeEntity> getJSON(@Url String url);
}
