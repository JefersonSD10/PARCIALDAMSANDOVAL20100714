package dev.jj.parcialdamsandoval20100714

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smartapp.MenuActivity
import dev.jj.parcialdamsandoval20100714.R.*

class LoginActivity : AppCompatActivity() {

    private val correctEmail = "admin@travelapp.com"
    private val correctPassword = "admin123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_login)

        val emailEditText = findViewById<EditText>(id.emailEditText)
        val passwordEditText = findViewById<EditText>(id.passwordEditText)
        val loginButton = findViewById<Button>(id.loginButton)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email == correctEmail && password == correctPassword) {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Credenciales Inválidas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}