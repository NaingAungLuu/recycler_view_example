package com.devdrogen.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter() : RecyclerView.Adapter<MovieViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent , false)
        return MovieViewHolder(view)

    }

    override fun getItemCount(): Int {

        return 7

    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {



    }
}