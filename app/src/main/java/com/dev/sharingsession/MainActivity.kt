package com.dev.sharingsession

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dev.sharingsession.april25.MainActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import com.dev.sharingsession.juni20.view.MainActivity as MainActivity2
import com.dev.sharingsession.mei16.view.MainActivity as MainActivity1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener { startActivity<MainActivity>() }
        btn2.setOnClickListener { startActivity<MainActivity1>() }
        btn3.setOnClickListener { startActivity<MainActivity2>() }
    }
}
