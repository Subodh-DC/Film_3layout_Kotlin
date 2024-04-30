package com.example.a3layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listcata:ListView
    val arraycata= arrayOf("1. Actors","2. Actresses","3. Directors","4. Comedians")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listcata=findViewById(R.id.categorieslist)
        val callarray=ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,arraycata)
        listcata.adapter=callarray
        listcata.setOnItemClickListener { parent, view, i, id ->
          //  Toast.makeText(this, ""+arraycata[i], Toast.LENGTH_SHORT).show()
            val main2=Intent(this,MainActivity2::class.java)
            main2.putExtra("pos",""+i)
            startActivity(main2)

        }
    }
}