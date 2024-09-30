package com.example.testin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    var btn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main2)

        btn = findViewById(R.id.btnNextPage)

        btn?.setOnClickListener {
            val i : Intent = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } */

        Log.d("Memanggil","Creating Ryoiki Tenkai")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Memanggil","Ryoiki Tenkai Starting")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Memanggil","Ryoiki Tenkai Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Memanggil","Ryoiki Tenkai Paused")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Memanggil","Restarting Ryoiki Tenkai")
    }
}