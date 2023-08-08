package com.example.libraryadd

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout
import android.widget.TextView
import com.kotlintest.app.R

class xmlview(context: Context, attrs: AttributeSet) : RelativeLayout(context, attrs) {
    private val etUsername: EditText
    private val etPassword: EditText
    private val btnLogin: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.xmlview, this, true)
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
    }

    // Add methods to interact with the widget as needed
}