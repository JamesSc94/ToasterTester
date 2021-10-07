package com.example.toastertester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastershow.ToasterMessager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessager.toastMessage(this, "")
//        ToasterMessage

    }
}