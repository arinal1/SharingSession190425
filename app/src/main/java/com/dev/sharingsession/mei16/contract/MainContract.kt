package com.dev.sharingsession.mei16.contract

interface MainContract {
    interface View {
        fun initView()
        fun updateView()
    }

    interface Presenter {
        fun getCounter(): String
        fun incrementValue()
    }

    interface Model {
        fun getCounter(): Int
        fun incrementCounter()
    }
}
