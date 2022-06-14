package com.example.enviar_datos_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class activity_recibe_datos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibe_datos)
    }

    override fun onStart() {
        super.onStart()
        val nombre = findViewById<TextView>(R.id.txtNomUsuario2);
        val genero = findViewById<TextView>(R.id.txtGeneroUsuario2);
        val fechaNaci = findViewById<TextView>(R.id.txtFechaUsuario2);
        val telefono = findViewById<TextView>(R.id.txtTelfUsuario2);
        val bundle = this.getIntent().getExtras();

        nombre.setText(bundle?.getString("nombreUsuario"));
        genero.setText(bundle?.getString("generoUsuario"));
        fechaNaci.setText(bundle?.getString("fechaUsuario"));
        telefono.setText(bundle?.getString("telfUsuario"));
    }

    fun btnRegresarFormulario(view:View){
        val intent = Intent(this, MainActivity::class.java);
        startActivity(intent);
    }
}