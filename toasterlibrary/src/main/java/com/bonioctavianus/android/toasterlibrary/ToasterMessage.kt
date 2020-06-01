package com.bonioctavianus.android.toasterlibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {

    fun showMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}