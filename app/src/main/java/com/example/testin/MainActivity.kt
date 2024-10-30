package com.example.testin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge

class MainActivity : BaseActivity() {
    private lateinit var nameInput: EditText
    var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.gurunji_dashboarad)

        btn = findViewById(R.id.loginButton)
        nameInput = findViewById(R.id.loginInput)

        btn?.setOnClickListener {
            val userName = nameInput.text.toString()
            val intent = Intent(this, MenuActivity::class.java)
            intent.putExtra("USER_NAME", userName)
            startActivity(intent)
        }



        /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
             val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
             v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
             insets
         }*/
    }


    override fun onDestroy() {
        super.onDestroy()
        val i : Intent = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    /*override fun onResume() {
        super.onResume()

        GlobalScope.launch(Dispatchers.Main) {
            delay(2000)
            finish()
        }
    }*/
}