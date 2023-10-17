package com.example.tpseminariosofiaasan.principal

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tpseminariosofiaasan.Actor
import com.example.tpseminariosofiaasan.ActorAdapter
import com.example.tpseminariosofiaasan.R


class ListadoActoresActivity : AppCompatActivity() {

    lateinit var rvActor: RecyclerView
    lateinit var actoresAdapter: ActorAdapter
    lateinit var toolbar: androidx.appcompat.widget.Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_actores)


        rvActor = findViewById(R.id.rvListadoActores)
        actoresAdapter = ActorAdapter(GetActores(), this)
        rvActor.adapter = actoresAdapter


        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar!!.title = resources.getString(R.string.titulo)
        
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_listado_actores, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.item_back){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun GetActores(): MutableList<Actor> {
        var actores: MutableList<Actor> = ArrayList()
        actores.add(Actor(1, "Daniel Radcliffe", "23 de Julio de 1989"))
        actores.add(Actor(2, "Emma Watson", "15 de Abril de 1990"))
        actores.add(Actor(3, "Rupert Grint", "24 de Agosto de 1988"))
        actores.add(Actor(4, "Tom Felton", "22 de Septiembre de 1987"))
        actores.add(Actor(5, "Alan Rickman", "29 de Septiembre de 1946"))
        return actores
    }
}