package com.dev.sharingsession.juni20.view

import com.dev.sharingsession.juni20.model.UserData

interface MainContract {
    fun hitApiOneUSer()
    fun dialogShow(user: UserData)
}