package com.ahmedfarouk.e_commerce;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    productCategoryAdapter ADP ;
    RecyclerView RCV , productItemRecycler ;
    productsAdapter PA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<ProductCategory>Products = new ArrayList<>();
        Products.add(new ProductCategory(1 , "Most Popular"));
        Products.add(new ProductCategory(2 , "Trending"));
        Products.add(new ProductCategory(3 , "All Body Products"));
        Products.add(new ProductCategory(4 , "All body products"));
        Products.add(new ProductCategory(5 , "Skin care"));
        Products.add(new ProductCategory(6 , "Hair care"));
        Products.add(new ProductCategory(7 , "Make Up"));

        setProductRecycler(Products);

        List<products> productsList = new ArrayList<>();
        productsList.add(new products("Japanese Cherry Blossom","250 ml" ,"$ 18.00", R.drawable.prod1,1));
        productsList.add(new products("African Mango shower gel","350 ml" ,"$ 25.00", R.drawable.prod2,2));
        productsList.add(new products(" Blossom","450 ml" ,"$ 30.00", R.drawable.prod1,3));
        productsList.add(new products("Body splash","350 ml" ,"$ 40.00", R.drawable.prod2,4));

        productsList.add(new products("Japanese Cherry ","150 ml" ,"$ 8.00", R.drawable.prod1,5));
        productsList.add(new products(" shower gel","350 ml" ,"$ 25.00", R.drawable.prod2,6));

        productsList.add(new products("hair gel","250 ml" ,"$ 49.50", R.drawable.prod1,7));
        productsList.add(new products("African Mango shower gel","350 ml" ,"$ 25.00", R.drawable.prod2,8));
    setProductsRecycler(productsList);

    }

    private  void setProductRecycler(List<ProductCategory> ProductCategoryList)
    {
        RCV = findViewById(R.id.rec_Product_category);
        RecyclerView.LayoutManager layoutmanger = new LinearLayoutManager(this ,RecyclerView.HORIZONTAL ,false );
        RCV.setLayoutManager(layoutmanger);
        ADP = new productCategoryAdapter(this , ProductCategoryList );
        RCV.setAdapter(ADP);

    }
    private void setProductsRecycler(List<products> productsList)
    {
        productItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this ,RecyclerView.HORIZONTAL, false);
        productItemRecycler.setLayoutManager(layoutManager);
        PA  = new productsAdapter(this,productsList);
        productItemRecycler.setAdapter(PA);



    }

}