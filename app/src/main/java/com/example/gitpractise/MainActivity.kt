package com.example.gitpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = getData()
        performOperation(data)
    }

    private fun performOperation(data: String) {
        if (data.equals("Data")){
            println("Success")
        }else{
            throw NullPointerException("Failed")
        }
    }

    private fun getData(): String {
        return "Null"
    }
}