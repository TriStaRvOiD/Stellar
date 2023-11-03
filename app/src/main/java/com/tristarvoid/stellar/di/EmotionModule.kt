package com.tristarvoid.stellar.di

import com.tristarvoid.stellar.retrofit.emotion.EmotionApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EmotionModule {

    @Provides
    @Singleton
    fun provideRetrofitInstanceForSentiment(): EmotionApi {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:5000/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EmotionApi::class.java)
    }
}