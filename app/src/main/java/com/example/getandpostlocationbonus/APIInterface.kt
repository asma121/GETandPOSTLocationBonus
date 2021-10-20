package com.example.getandpostlocationbonus

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface APIInterface {

    // @Headers("Content-Type: application/json")
    @GET("/test/")
    fun getUserDetails(): Call<List<UsersDetails.Datum>>

    // @Headers("Content-Type: application/json")
    @POST("/test/")
    fun addUserDetails(@Body userdata:UsersDetails.Datum): Call<UsersDetails.Datum>

}