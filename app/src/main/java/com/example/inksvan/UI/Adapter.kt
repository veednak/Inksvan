package com.example.inksvan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.inksvan.R.layout.card_view
import com.example.inksvan.UI.ModelImage
import kotlinx.android.synthetic.main.card_view.view.*


class MyAdapter(private val exampleList: List<ModelImage?>) :
    RecyclerView.Adapter<MyAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            card_view,
            parent, false
        )
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView1.setImageResource(currentItem!!.Img1)
        holder.imageView2.setImageResource(currentItem!!.Img2)
        holder.imageView3.setImageResource(currentItem!!.Img3)


    }

    override fun getItemCount() = exampleList.size
    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView1: ImageView = itemView.cardImage1
        val imageView2: ImageView = itemView.cardImage2
        val imageView3: ImageView = itemView.cardImage3
    }
}