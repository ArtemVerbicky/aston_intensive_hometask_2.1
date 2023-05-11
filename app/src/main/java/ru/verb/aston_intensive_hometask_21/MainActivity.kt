package ru.verb.aston_intensive_hometask_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        const val LOG_TAG: String = "AAAAAAAAAAAAAAAAA"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOG_TAG, "Hello World!")
        throwException()
    }

    private fun throwException() {
        try {
            throw Exception("hello from eception!")
        } catch (e: Exception) {
            Log.e(LOG_TAG, "My exception.", e)
        }
    }

}