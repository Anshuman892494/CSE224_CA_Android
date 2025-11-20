package com.example.markscalc   // change only if your app package is different
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val user = username.text.toString().trim()
            val pass = password.text.toString().trim()

            if (user == "admin" && pass == "123") {
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid Username or Password!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

