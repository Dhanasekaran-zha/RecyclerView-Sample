package com.example.recyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var temp:ArrayList<RecPojo>?=ArrayList()
    private var adapter:RecAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rec_view.layoutManager=LinearLayoutManager(this)
        adapter=RecAdapter(this,temp!!)
        rec_view.adapter=adapter
        submit.setOnClickListener{
            var obj=RecPojo()
            obj.name=nameEdt.text.toString()
            obj.number=numEdt.text.toString()
            temp!!.add(obj)
        }
    }
}