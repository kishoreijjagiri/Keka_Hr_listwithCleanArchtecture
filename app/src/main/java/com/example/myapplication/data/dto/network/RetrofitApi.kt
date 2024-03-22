package com.example.myapplication.data.dto.network

import com.example.myapplication.data.dto.Response
import retrofit2.http.GET

interface RetrofitApi {

    @GET("/svc/topstories/v2/arts.json?api-key=j5GCulxBywG3lX211ZAPkAB8O381S5SM")
    suspend fun getData():Response
}