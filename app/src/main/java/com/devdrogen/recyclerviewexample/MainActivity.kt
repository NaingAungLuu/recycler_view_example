package com.devdrogen.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDemo.adapter = RecyclerAdapter()
        rvDemo.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false)

    }
}
