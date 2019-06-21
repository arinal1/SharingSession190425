package com.dev.sharingsession.juni20.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dev.sharingsession.R
import com.dev.sharingsession.juni20.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {

    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnHit.setOnClickListener { presenter.hitApiOneUSer() }
    }
}
