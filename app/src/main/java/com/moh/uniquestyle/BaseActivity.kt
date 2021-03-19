package com.moh.uniquestyle

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity() : AppCompatActivity() {

    fun startNewActivity(_activity: Activity) {
        val intent = Intent(this, _activity::class.java)
        startActivity(intent)
    }
}