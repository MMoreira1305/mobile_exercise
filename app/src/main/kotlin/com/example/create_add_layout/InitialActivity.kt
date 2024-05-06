package com.example.create_add_layout

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InitialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_initial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<AppCompatButton>(R.id.myButton)
        val editText = findViewById<AppCompatEditText>(R.id.edtName)
        button.setOnClickListener{
            val texto = editText.text.toString()
            if (texto.length > 1){
                val intent = Intent(this@InitialActivity, MainActivity::class.java)
                intent.putExtra("USER_NAME", texto)
                val mensagem = R.string.add_contact_success_message;
                Toast.makeText(this@InitialActivity, mensagem, Toast.LENGTH_SHORT).show()
                finish()
                startActivity(intent)
            }else{
                val mensagem = R.string.generic_error_message;
                Toast.makeText(this@InitialActivity, mensagem, Toast.LENGTH_SHORT).show()
            }
        }
    }
}