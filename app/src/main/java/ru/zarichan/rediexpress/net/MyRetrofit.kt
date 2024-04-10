package ru.zarichan.rediexpress.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyRetrofit {
    fun get(): Retrofit = Retrofit.Builder()
        .baseUrl("http://exam.uaviak.ru/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}