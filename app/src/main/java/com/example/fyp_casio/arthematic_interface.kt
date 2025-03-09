package com.example.fyp_casio

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface arthematic_interface {
    @GET("calculate")   // Example endpoint
    fun arthematci_operation(
        @Query("value1") value1: Int,

    ): Call<String>


}