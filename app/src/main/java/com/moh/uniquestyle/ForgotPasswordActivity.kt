package com.moh.uniquestyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotPasswordActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        var tvBackToLoginPage = findViewById<TextView>(R.id.tv_back_to_login_page)


        tvBackToLoginPage.setOnClickListener {

           onBackPressed()
        }
    }
}