package com.dev.sharingsession

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val email = intent.getStringExtra("email")
        val pass = intent.getStringExtra("pass")
        val role = intent.getIntExtra("role", 0)

        txEmail.text = "email : $email"
        txPassword.text = "pass : $pass"
        txRole.text = "role : $role"

        btnOke.setOnClickListener {
            setResult(RESULT_OK, Intent().putExtra("data", "Berhasil"))
            finish()
        }
    }
}
