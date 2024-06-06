package com.example.myapplicationdemo

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersViewAdapter(
    private val context: Context,
    private val arrayList: List<NumbersView>
) : RecyclerView.Adapter<NumbersViewAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val numbersImage: ImageView = itemView.findViewById(R.id.imageView)
        val textView1: TextView = itemView.findViewById(R.id.textView1)
        val textView2: TextView = itemView.findViewById(R.id.textView2)
        val extraImageView: ImageView = itemView.findViewById(R.id.extraImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_list_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentNumberPosition = arrayList[position]

        holder.numbersImage.setImageResource(currentNumberPosition.ivNumbersImageId)
        holder.textView1.text = currentNumberPosition.mNumberInDigit
        holder.textView2.text = currentNumberPosition.mNumbersInText
        holder.extraImageView.setImageResource(currentNumberPosition.extraImageId)

        // Set text color of textView1 based on position
        val color = when (position % 3) {
            0 -> Color.RED
            1 -> Color.GREEN
            else -> Color.BLUE
        }
        holder.textView1.setTextColor(color)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}
