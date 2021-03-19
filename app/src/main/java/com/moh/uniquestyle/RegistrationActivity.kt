package com.moh.uniquestyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView
import com.google.android.material.textview.MaterialTextView

class RegistrationActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var tvSignIn = findViewById<TextView>(R.id.tv_sign_in)
        var edtName = findViewById<EditText>(R.id.edt_name)
        var edtUsername = findViewById<EditText>(R.id.edt_username)
        var edtPassword = findViewById<EditText>(R.id.edt_password)
        var edtConfirmPassword = findViewById<EditText>(R.id.edt_confirm_password)
        var edtEmail = findViewById<EditText>(R.id.edt_email)
        var btnSignup = findViewById<Button>(R.id.btn_sign_up)
        var spnCountry = findViewById<Spinner>(R.id.spn_country)

        tvSignIn.setOnClickListener {
            /* val intent = Intent (this,MainActivity::class.java)
             startActivity(intent)
             finish()*/
            onBackPressed()
        }
        val country = resources.getStringArray(R.array.country)
        val adapter = ArrayAdapter(this, R.layout.layout_spinner_item, country)
        spnCountry.adapter = adapter

        spnCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

            }
        }

        btnSignup.setOnClickListener {
            checkValidation(edtName, edtUsername, edtEmail, edtPassword, edtConfirmPassword)
        }

    }

    private fun checkValidation(
        edtName: EditText,
        edtUsername: EditText,
        edtEmail: EditText,
        edtPassword: EditText,
        edtConfirmPassword: EditText
    ) {
        if (edtName.text.isEmpty()
            || edtUsername.text.isEmpty()
            || edtEmail.text.isEmpty()
            || edtPassword.text.isEmpty()
            || edtConfirmPassword.text.isEmpty()
        ) {
            Toast.makeText(this, "Fill your empty fields", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Sign Up Successfully", Toast.LENGTH_LONG).show()

        }
    }
}