package com.semin.basesinglemoduleexample.data.api

import retrofit2.http.GET

interface SampleAPI {

    @GET
    fun test()
}