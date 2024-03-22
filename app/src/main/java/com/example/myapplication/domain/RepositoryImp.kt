package com.example.myapplication.domain

import com.example.myapplication.data.dto.Response
import com.example.myapplication.data.dto.network.RetrofitApi
import javax.inject.Inject

class RepositoryImp @Inject constructor (val retrofitApi: RetrofitApi) :Repository {
    override suspend fun getData(): Response {
       return retrofitApi.getData()
    }


}