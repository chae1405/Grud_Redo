package com.example.re_grud.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.re_grud.MainActivity
import com.example.re_grud.R
import com.example.re_grud.Signup.Signup

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Log.d("tag","로그인 화면 시작")
        val impt1 = findViewById<View>(R.id.login);
        val impt2 = findViewById<View>(R.id.join3);

        impt1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)//다음화면으로 이동하기위한 인텐트 객체생성

            startActivity(intent);

        }
        impt2.setOnClickListener{
            val intent = Intent(this, Signup::class.java)//다음화면으로 이동하기위한 인텐트 객체생성

            startActivity(intent);

        }
    }
}