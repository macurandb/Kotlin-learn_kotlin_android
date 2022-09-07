package com.example.examplemvvm.data.network

import com.example.examplemvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {

    @GET("quotes")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>

}