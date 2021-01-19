package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NatureAdapter(private var natures:List<Nature>,private val context:Context): RecyclerView.Adapter<NatureAdapter.NatureViewHolder>() {

    class NatureViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NatureViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nature_item, parent, false)
        return NatureViewHolder(view)
    }

    override fun onBindViewHolder(holder: NatureViewHolder, position: Int) {
        val p = natures[position]

        Glide
            .with(context)
            .load(p.url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)


    }

    override fun getItemCount(): Int  = natures.size
}