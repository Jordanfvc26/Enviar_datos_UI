package com.example.enviar_datos_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnEnviarDatos(view: View){
        val nombre = findViewById<EditText>(R.id.txtNomUsuario);
        val generoMas = findViewById<RadioButton>(R.id.rdbMasculino);
        val generoFem = findViewById<RadioButton>(R.id.rdbFemenino);
        val generoInde = findViewById<RadioButton>(R.id.rdbIndeterminado);
        val fechaNaci = findViewById<EditText>(R.id.txtFechaUsuario);
        val telefono = findViewById<EditText>(R.id.txtTelfUsuario);

        val bundle = Bundle();
        bundle.putString("nombreUsuario", nombre.text.toString());
        //Verificamos que radio button se marcó
        if(generoMas.isChecked)
            bundle.putString("generoUsuario", generoMas.text.toString());
        else if(generoFem.isChecked)
            bundle.putString("generoUsuario", generoFem.text.toString());
        else
            bundle.putString("generoUsuario", generoInde.text.toString());
        bundle.putString("fechaUsuario", fechaNaci.text.toString());
        bundle.putString("telfUsuario", telefono.text.toString());

        val intent = Intent(this, activity_recibe_datos::class.java);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}