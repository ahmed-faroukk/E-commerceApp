package com.ahmedfarouk.e_commerce;

public class products {
    String productName , productQty , productPrice ;
    int imageUrl , productId;

    public products(String productName, String productQty, String productPrice, int imageUrl, int productId) {
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
        this.imageUrl = imageUrl;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductQty() {
        return productQty;
    }

    public void setProductQty(String productQty) {
        this.productQty = productQty;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
