package ru.zarichan.rediexpress

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        nameTextView = findViewById(R.id.tv_welcome_name)
        nameTextView.text = if (intent != null) intent.getStringExtra("name") else "DICK"
    }

    fun goToMain(view: View) {
        startActivity(
            Intent(
                this,
                LoginActivity::class.java
            )
        );
    }
}