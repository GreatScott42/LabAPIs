package me.greatscott42.labapis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b: Button = findViewById(R.id.button)

        b.setOnClickListener {
            var intent = Intent(this,ApiActivity::class.java)
            startActivity(intent)
        }

    }
}