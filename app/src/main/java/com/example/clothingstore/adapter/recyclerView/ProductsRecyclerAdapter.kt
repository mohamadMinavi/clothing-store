package com.example.clothingstore.adapter.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.clothingstore.databinding.RecyclerItemBinding
import com.example.clothingstore.remote.dataModel.allProducts.ProductsModelItem
import com.squareup.picasso.Picasso

class ProductsRecyclerAdapter(
    private val allData: ArrayList<ProductsModelItem>
) :
    RecyclerView.Adapter<ProductsRecyclerAdapter.ProductsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ProductsViewHolder(
            RecyclerItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )

    override fun getItemCount(): Int = allData.size

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.setData(allData[position])
    }

    inner class ProductsViewHolder(
        val binding: RecyclerItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun setData(item: ProductsModelItem){
            val uri = item.image
            Picasso.get()
                .load(uri)
                .into(binding.itemImg)

            binding.itemTitle.text = item.title
            binding.itemPrice.text = "$${item.price}"
        }

    }

}