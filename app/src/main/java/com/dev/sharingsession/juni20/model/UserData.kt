package com.dev.sharingsession.juni20.model

data class UserData(
    val `data`: Data
){
    data class Data(
        val avatar: String,
        val email: String,
        val first_name: String,
        val id: Int,
        val last_name: String
    )
}