package com.lokalina.sharingsession.mei16.model

import com.lokalina.sharingsession.mei16.contract.MainContract.Model

class MainModel : Model {

    private var counter = 0

    override fun getCounter(): Int = counter

    override fun incrementCounter() {counter++}
}