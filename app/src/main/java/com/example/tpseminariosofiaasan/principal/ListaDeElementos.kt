package com.example.tpseminariosofiaasan.principal

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.tpseminariosofiaasan.R
import com.example.tpseminariosofiaasan.UserApplication.Companion.preferencias

class listaDeElementos : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var tvBienvenida: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_elementos)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = resources.getString(R.string.titulo)

        tvBienvenida = findViewById(R.id.tvBienvenida)
        val username = preferencias.getUsername()
        tvBienvenida.text = "Bienvenido $username"



        val botonHP1 = findViewById<Button>(R.id.btnHP1)
        botonHP1.setOnClickListener {
            val intent3 = Intent(this, elementoIndividual1::class.java)
            startActivity(intent3)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_pantalla_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.item_back2){
            onBackPressed()
        }

        if(item.itemId == R.id.item_listado){
            preferencias.wipe()
            Toast.makeText(this, "Usuario olvidado", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

}