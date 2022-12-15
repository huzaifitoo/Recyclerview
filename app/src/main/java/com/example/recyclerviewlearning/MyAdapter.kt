package com.example.recyclerviewlearning

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlearning.databinding.ItemClassBinding

class MyAdapter(var context: Context, private val mDataModalClass:ArrayList<DataModalClass>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    class MyViewHolder (private val binding: ItemClassBinding):RecyclerView.ViewHolder(binding.root){

        fun bind(dataModalClass: DataModalClass){
            binding.TvName.text=dataModalClass.Name
            binding.TvMarks.text=dataModalClass.Marks.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val ItemClassBinding = ItemClassBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(ItemClassBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataModalClass= mDataModalClass[position]
        holder.bind(dataModalClass)
    }

    override fun getItemCount(): Int {
        return mDataModalClass.size
    }
}