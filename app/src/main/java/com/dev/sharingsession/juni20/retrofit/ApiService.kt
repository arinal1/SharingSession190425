package com.dev.sharingsession.juni20.retrofit

import com.dev.sharingsession.juni20.model.UserData
import com.dev.sharingsession.juni20.model.UsersData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("api/users/{id}")
    fun getUser(@Path("id") id: String) : Single<UserData>

    @GET("api/users")
    fun getUsers(@Query("page") page: String) : Single<UsersData>
}