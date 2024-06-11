package com.tristarvoid.write.retrofit.emotion

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface EmotionApi {

    @GET("/predict")
    suspend fun fetchEmotion(
        @Query("textData") textData: String
    ): Response<String>
}