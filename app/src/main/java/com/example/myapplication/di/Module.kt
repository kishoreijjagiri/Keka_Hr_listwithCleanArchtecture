package com.example.myapplication.di

import com.example.myapplication.data.dto.network.RetrofitApi
import com.example.myapplication.domain.Repository
import com.example.myapplication.domain.RepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Singleton
    @Provides
    fun provideRetrofit()=Retrofit.Builder()
        .baseUrl("https://api.nytimes.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) = retrofit.create(RetrofitApi::class.java)

    @Provides
    fun provideRepository(api: RetrofitApi): Repository = RepositoryImp(api)

}