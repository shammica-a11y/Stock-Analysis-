package com.shammi.portfolioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val etUrl = findViewById<EditText>(R.id.etUrl)
        val btnSave = findViewById<Button>(R.id.btnSave)

        etUrl.setText(Prefs.getUrl(this) ?: "")

        btnSave.setOnClickListener {
            val newUrl = etUrl.text.toString().trim()
            if (newUrl.isNotBlank()) {
                Prefs.setUrl(this, newUrl)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                etUrl.error = "Enter a valid URL"
            }
        }
    }
}
