package com.example.testin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MenuActivity : BaseActivity() {

    var ProfileBtn: Button? = null
    var MrHeadBtn: Button? = null
    var ContactsBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.gurunji_menu)

        val userName = intent.getStringExtra("USER_NAME").takeIf { !it.isNullOrEmpty() } ?: "User"
        val greetingMessage = "Hello, $userName!"
        findViewById<TextView>(R.id.greeting).text = greetingMessage

        ProfileBtn = findViewById(R.id.ProfileBtn)

        ProfileBtn?.setOnClickListener {
            val  i: Intent = Intent(this, ProfileActivity ::class.java)
            startActivity(i);
        }

        MrHeadBtn = findViewById(R.id.MisterHeadBtn)

        MrHeadBtn?.setOnClickListener {
            val i: Intent = Intent(this, MisterHeadActivity ::class.java)
            startActivity(i)
        }

        ContactsBtn = findViewById(R.id.ContactsBtn)

        ContactsBtn?.setOnClickListener {
            val  i: Intent = Intent(this, ContactUsActivity ::class.java)
            startActivity(i);
        }
    }
}