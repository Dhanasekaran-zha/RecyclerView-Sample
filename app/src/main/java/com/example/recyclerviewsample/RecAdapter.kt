package com.example.recyclerviewsample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(val context: Context,var temp:ArrayList<RecPojo>):RecyclerView.Adapter<RecAdapter.RecListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecAdapter.RecListViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.rec_view_module,parent,false)
        return RecListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  temp.size
    }

    override fun onBindViewHolder(holder: RecAdapter.RecListViewHolder, position: Int) {
        holder.nameT!!.text=temp[position].name
        holder.numT!!.text=temp[position].number
    }
    inner class RecListViewHolder(view: View):RecyclerView.ViewHolder(view){
        var nameT:TextView?=null
        var numT:TextView?=null
        init {
            nameT=view.findViewById<TextView>(R.id.nametvw)
            numT=view.findViewById<TextView>(R.id.numtvw)
        }
    }
}