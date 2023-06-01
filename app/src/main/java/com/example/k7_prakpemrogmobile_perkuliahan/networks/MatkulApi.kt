package com.example.k7_prakpemrogmobile_perkuliahan.networks

import com.example.k7_prakpemrogmobile_perkuliahan.model.Matkul
import com.skydoves.sandwich.ApiResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface MatkulApi {
    @GET("api/matakuliah")
    suspend fun all(): ApiResponse<MatkulGetResponse>
    @GET("api/matakuliah/{id}")
    suspend fun find(@Path("id") id: String):
            ApiResponse<MatkulSingleGetResponse>
    @POST("api/matakuliah")
    @Headers("Content-Type: application/json")
    suspend fun insert(@Body item: Matkul):
            ApiResponse<MatkulSingleGetResponse>
    @PUT("api/matakuliah/{id}")
    @Headers("Content-Type: application/json")
    suspend fun update(@Path("id") pathId: String,
                       @Body item: Matkul):
            ApiResponse<MatkulSingleGetResponse>
    @DELETE("api/matakuliah/{id}")
    suspend fun delete(@Path("id") id: String):
            ApiResponse<MatkulSingleGetResponse>
}