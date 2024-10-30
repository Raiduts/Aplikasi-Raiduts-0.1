package com.example.testin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge

class ContactUsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.gurunji_contacts)

        val whatsappBtn: Button = findViewById(R.id.WhatsappBtn)
        val gmailBtn: Button = findViewById(R.id.GmailBtn)
        val teleponBtn: Button = findViewById(R.id.TeleponBtn)
        val smsBtn: Button = findViewById(R.id.smsBtn)

        // WhatsApp Button
        whatsappBtn.setOnClickListener {
            val contact = "+6289518261422" // Use your WhatsApp contact
            val message = "Halo Rowrrr..."

            val uri = Uri.parse("https://api.whatsapp.com/send?phone=$contact&text=" + Uri.encode(message))
            val intent = Intent(Intent.ACTION_VIEW, uri)

            try {
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // Gmail Button
        gmailBtn.setOnClickListener {
            val email = "raion@example.com" // Replace with your email address
            val subject = "Hello from App"
            val message = "Hello Rowrrr..."

            val uri = Uri.parse("mailto:$email")
                .buildUpon()
                .appendQueryParameter("subject", subject)
                .appendQueryParameter("body", message)
                .build()

            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = uri
            }

            try {
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // Call Button
        teleponBtn.setOnClickListener {
            val phoneNumber = "+6289518261422" // Use your phone number
            val uri = Uri.parse("tel:$phoneNumber")
            val intent = Intent(Intent.ACTION_DIAL, uri)

            try {
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // SMS Button
        smsBtn.setOnClickListener {
            val phoneNumber = "+6289518261422" // Use your phone number
            val message = "Hello Rowrrr..."

            val uri = Uri.parse("smsto:$phoneNumber")
                .buildUpon()
                .appendQueryParameter("sms_body", message)
                .build()

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            try {
                startActivity(intent)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}