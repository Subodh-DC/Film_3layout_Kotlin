package com.example.a3layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.time.Instant
import java.time.InstantSource

class MainActivity2 : AppCompatActivity() {
    lateinit var list1:ListView
    val Actorsarray= arrayOf("1. Shah Rukh Khan","2. Amitabh Bachchan","3. Aamir Khan",
        "4. Salman Khan","5. Akshay Kumar")
    val Actressesarray= arrayOf("1. Deepika Padukone","2. Priyanka Chopra Jonas","3. Kangana Ranaut",
        "4. Alia Bhatt","5. Kareena Kapoor Khan")
    val Directorsarray= arrayOf("1. Karan Johar","2. Rajkumar Hirani","3. Sanjay Leela Bhansali",
        "4. Zoya Akhtar","5. Anurag Kashyap")
    val Comediansarray= arrayOf("1. Johnny Lever","2. Paresh Rawal","3. Govinda","4. Rajpal Yadav",
        "5. Boman Irani")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        list1=findViewById(R.id.listview2)
        val actoradapt=ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Actorsarray)
        val actressesadapt= ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Actressesarray)
        val directoradapt=ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Directorsarray)
        val comadiansadapt=ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Comediansarray)
        val p1=intent.extras?.getString("pos")
        if (p1.equals("0")){
            list1.adapter=actoradapt
            list1.setOnItemClickListener { parent, view, a, id ->
                val m1=Intent(this,MainActivity3::class.java)
                m1.putExtra("p1",""+a)
                startActivity(m1)
            }
        }
        else if (p1.equals("1")){
            list1.adapter=actressesadapt
            list1.setOnItemClickListener { parent, view, b, id ->
                val m2=Intent(this,MainActivity3::class.java)
                m2.putExtra("p2",""+b)
                startActivity(m2)
            }
        }
        else if (p1.equals("2")){
            list1.adapter=directoradapt
            list1.setOnItemClickListener { parent, view, c, id ->
                val m3=Intent(this,MainActivity3::class.java)
                m3.putExtra("p3",""+c)
                startActivity(m3)
            }
        }
        else if (p1.equals("3")){
            list1.adapter=comadiansadapt
            list1.setOnItemClickListener { parent, view, d, id ->
                val m4=Intent(this,MainActivity3::class.java)
                m4.putExtra("p4",""+d)
                startActivity(m4)
            }
        }
    }
}