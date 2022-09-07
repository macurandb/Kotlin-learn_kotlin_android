package com.example.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit  {
        return Retrofit.Builder().baseUrl("http://localhost:9000/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}