package com.semin.basesinglemoduleexample.data.api

import retrofit2.Retrofit

interface RetrofitProvider {

    fun build(baseUrl: String): Retrofit

    fun sampleAPI(): SampleAPI
}