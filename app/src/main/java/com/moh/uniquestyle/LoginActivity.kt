package com.moh.uniquestyle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : BaseActivity() {

    val USERNAME = "Syed"
    val PASSWORD = "786786"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var tvSignUp = findViewById<TextView>(R.id.tv_sign_up)
        var tvForgetPassword = findViewById<TextView>(R.id.tv_forgot_password)
        var edtUsername = findViewById<EditText>(R.id.edt_username)
        var edtPassword = findViewById<EditText>(R.id.edt_password)
        var btnSignIn = findViewById<Button>(R.id.btn_sign_in)

        tvSignUp.setOnClickListener {
            startNewActivity(RegistrationActivity())
        }
        tvForgetPassword.setOnClickListener {
            startNewActivity(ForgotPasswordActivity())
        }
        btnSignIn.setOnClickListener {
            checkValidation(edtUsername.text.toString(), edtPassword.text.toString())
        }
    }
    private fun checkValidation(username: String, pass: String) {
        if (username.trim().toLowerCase() == USERNAME.trim().toLowerCase() && pass == PASSWORD) {
            Toast.makeText(this, getString(R.string.sign_in_successfully), Toast.LENGTH_LONG).show()
        startNewActivity(DashboardActivity())
        } else {
            Toast.makeText(this, getString(R.string.sign_in_failed), Toast.LENGTH_LONG).show()
        }
    }
}