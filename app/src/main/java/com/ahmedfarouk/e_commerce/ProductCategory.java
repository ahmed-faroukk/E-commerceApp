package com.ahmedfarouk.e_commerce;

public class ProductCategory {

    int productId ;
    String productName ;

     ProductCategory(int productId , String productName)
     {
        this.productId = productId;
        this.productName = productName ;
     }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}