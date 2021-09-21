package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //title array
    private var titles = arrayListOf("Burak 1","Burak 2", "Burak 3", "Burak 4", "Burak 5", "Burak8","Burak 2", "Burak 3")

    //details array
    private var details = arrayListOf("Detatail of one item","Detatail of one item","Detatail of one item","Detatail of one item","Detatail of one item",
        "Detatail of one item","Detatail of one item","Detatail of one item")

    private var images = intArrayOf(R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,R.drawable.android,
        R.drawable.android,R.drawable.android,R.drawable.android)





    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val itemTitle: TextView
        var itemImage: ImageView
        var itemDedatil: TextView

        init {
            // Define click listener for the ViewHolder's View.
            itemTitle = view.findViewById(R.id.item_title)
            itemImage = view.findViewById(R.id.item_image)
            itemDedatil = view.findViewById(R.id.title_detail)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        holder.itemTitle.text = titles[position]
        holder.itemDedatil.text = details[position]
        holder.itemImage.setImageResource(images[position])


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount(): Int{

        return titles.size
    }

}
