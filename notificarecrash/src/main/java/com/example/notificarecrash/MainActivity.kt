package com.example.notificarecrash

import android.app.Activity
import android.os.Bundle
import re.notifica.Notificare

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Notificare.launch()
    }
}