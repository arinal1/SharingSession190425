package com.dev.sharingsession.mei16.presenter

import com.dev.sharingsession.mei16.contract.MainContract.Presenter
import com.dev.sharingsession.mei16.contract.MainContract.View
import com.dev.sharingsession.mei16.model.MainModel

class MainPresenter (private val view: View): Presenter {

    private val model = MainModel()

    override fun getCounter(): String = model.getCounter().toString()

    override fun incrementValue() {
        model.incrementCounter()
        view.updateView()
    }

}