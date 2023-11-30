package com.example.mp_pr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(var mList : List<DataModel>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    inner class ImageViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val roadmapImage : ImageView = itemView.findViewById(R.id.roadmapIv)
        val roadmapTitle : TextView = itemView.findViewById(R.id.roadmapTv)
        val roadmapIdx : TextView = itemView.findViewById(R.id.roadmapIdx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    interface  ClickListener {
        fun onClick(v: View, position: Int)
    }

    fun setItemClickListener(itemclickListener: ClickListener) {
        this.ItemClickListener = itemclickListener
    }

    private lateinit var ItemClickListener : ClickListener

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.roadmapTitle.text = mList[position].title
        holder.roadmapImage.setImageResource((mList[position].image))

        holder.itemView.setOnClickListener {
            ItemClickListener.onClick(it, position)
        }

    }
}

