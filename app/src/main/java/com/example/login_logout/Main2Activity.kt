package com.example.login_logout

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var storageUsername = getSharedPreferences("username", Context.MODE_PRIVATE)
        username1.text = storageUsername.getString("userlogin", "")

        logout.setOnClickListener()
        {
            var editor = storageUsername.edit()
            editor.putString("userlogin", " ")
            editor.apply()

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
