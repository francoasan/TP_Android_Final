package com.example.tpseminariosofiaasan.principal

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.tpseminariosofiaasan.R

lateinit var toolbar: Toolbar

class elementoIndividual1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elemento_individual1)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = resources.getString(R.string.titulo)


        val botonVolverAElementos = findViewById<Button>(R.id.btnVolverAElementos)
        botonVolverAElementos.setOnClickListener{onBackPressed()}
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_lista_elementos, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.item_back2){
            onBackPressed()
        }

        if(item.itemId == R.id.item_listado){
            val intentListado = Intent(this, ActivityApi::class.java)
            startActivity(intentListado)
        }
        return super.onOptionsItemSelected(item)
    }

}

