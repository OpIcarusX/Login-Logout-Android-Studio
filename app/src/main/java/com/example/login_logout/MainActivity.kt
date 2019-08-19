package com.example.login_logout

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var storageUsername = getSharedPreferences("username", Context.MODE_PRIVATE)
        val storagePassword = getSharedPreferences("password", Context.MODE_PRIVATE)

        if (storageUsername.getString("userlogin", "")!=" ")
        {
            var intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
            finish()
        }

        login.setOnClickListener()
        {
            val username = username.text.toString()
            val password = password.text.toString()
            //jump to next activity
            var intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("username",username)
            intent.putExtra("password",password)

            var editor = storageUsername.edit()
            editor.putString("userlogin", username)
            editor.apply()
            var editor1 = storagePassword.edit()
            editor1.putString("passlogin", password)
            editor1.apply()
            startActivity(intent)
        }
    }
}
