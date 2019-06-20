package com.lokalina.sharingsession.mei16.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lokalina.sharingsession.R
import com.lokalina.sharingsession.mei16.contract.MainContract.View
import com.lokalina.sharingsession.mei16.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_counter.*

class MainActivity : AppCompatActivity(), View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        presenter = MainPresenter(this)
        initView()
    }

    override fun initView() {
        tv_counter.text = presenter.getCounter()
        button_counter.setOnClickListener { presenter.incrementValue() }
    }

    override fun updateView() {
        tv_counter.text = presenter.getCounter()
    }
}
