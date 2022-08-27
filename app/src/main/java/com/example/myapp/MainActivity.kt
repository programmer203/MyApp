package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var recyclerViews:RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    connectView()

perRerycler()
    }



    private fun connectView() {
     recyclerViews = findViewById(R.id.recyclerview)

  }
    private fun perRerycler() {
        val array:ArrayList<Person> = ArrayList()
        array.add(Person("اليوم الاول -مقدمة وافتتاحية", R.drawable.image2))
        array.add(Person("اليوم الثاني -الجمل الشرطية", R.drawable.image2))
        array.add(Person("اليوم الثالث -المصفوفات والدوال", R.drawable.image2))

        val adapterOne:Adapter = Adapter(array)
        recyclerViews?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerViews?.adapter = adapterOne
    }
}