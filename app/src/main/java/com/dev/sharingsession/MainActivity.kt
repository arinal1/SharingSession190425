package com.dev.sharingsession

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivityForResult

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener {
            loginButtonOnclick(it)
        }

        btnWaktu.setOnClickListener {
            val listener = TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                btnWaktu.text = "$hourOfDay:$minute"
            }
            val timePicker = TimePickerDialog(this@MainActivity, listener, 0, 0, false)
            timePicker.show()
        }

        btnTanggal.setOnClickListener {
            val listener = DatePickerDialog.OnDateSetListener { _, year, month, dayOfMonth ->
                btnTanggal.text = "$dayOfMonth $month $year"
            }
            val datePicker = DatePickerDialog(this, listener, 2019, 4, 25)
            datePicker.show()
        }
    }

    fun loginButtonOnclick(view: View){
        val email = txEmail.text.toString()
        val pass = txPassword.text.toString()
        val msg = email + pass
        var role = 0
        println(msg)
        txShow.setText(R.string.app_name)
        var cb = ""
        if (checkBox1.isChecked) {
            cb += checkBox1.text.toString()
            checkBox2.isChecked = false
            role = 1
        }
        if (checkBox2.isChecked) {
            cb += checkBox2.text.toString()
            checkBox1.isChecked = false
            role = 2
        }
        txCb.setText(cb)

//        val intent = Intent(this, HomeActivity::class.java)
//        intent.putExtra("email", email)
//        intent.putExtra("pass", pass)
//        intent.putExtra("role", role)
//        startActivity(intent)
        startActivityForResult<HomeActivity>(
            0,
            "email" to email,
            "pass" to pass,
            "role" to role
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && data != null){
            if (requestCode == 0){
                Toast.makeText(this@MainActivity, data.getStringExtra("data"), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
