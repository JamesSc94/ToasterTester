package com.example.toastershow

import android.content.Context
import android.widget.Toast

class ToasterMessager {

    companion object {
        fun toastMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

}