package com.ahmedfarouk.e_commerce;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.productViewHolder> {

    Context context;
    List<products> ProductsList;

    public productsAdapter(Context context, List<products> productsList) {
        this.context = context;
        ProductsList = productsList;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.product_row_item , parent , false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {

        holder.name.setText(ProductsList.get(position).getProductName());
        holder.price.setText(ProductsList.get(position).getProductPrice());
        holder.qty.setText(ProductsList.get(position).getProductQty());
        holder.img.setImageResource(ProductsList.get(position).getImageUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context , Product_detail.class);

                Pair[] pairs = new Pair[1];
                pairs[0] = new Pair<View , String>(holder.img , "image");
                ActivityOptions activityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity)context , pairs);
                context.startActivity(intent , activityOptions.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return ProductsList.size();
    }

    public static final class productViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img ;
        TextView name;
        TextView price;
        TextView qty;




        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.product_img);
            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.product_price);
            qty = itemView.findViewById(R.id.product_qty);



        }
    }
}
