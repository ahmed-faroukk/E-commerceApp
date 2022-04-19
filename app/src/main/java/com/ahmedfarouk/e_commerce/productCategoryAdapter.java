package com.ahmedfarouk.e_commerce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class productCategoryAdapter extends RecyclerView.Adapter<productCategoryAdapter.productViewHolder> {
    public static final class productViewHolder extends RecyclerView.ViewHolder
    {

        TextView categoryName;

        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.cat_name);
        }
    }
        Context context ;
        List<ProductCategory> productCategorylist ;

    public productCategoryAdapter(Context context, List<ProductCategory> productCategorylist) {
        this.context = context;
        this.productCategorylist = productCategorylist;
    }

    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_row_item, parent , false);
        return new productViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        holder.categoryName.setText(productCategorylist.get(position).getProductName());

    }

    @Override
    public int getItemCount() {
        return productCategorylist.size();
    }



}
