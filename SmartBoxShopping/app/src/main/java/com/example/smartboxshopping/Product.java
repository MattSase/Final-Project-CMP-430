package com.example.smartboxshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Product extends AppCompatActivity {
    private String productName;
    private String productID;
    private int productPrice;
    private int productImage;
    private int productQty;


    public Product(String productName, String productID, int productPrice, int productImage, int productQty){
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productQty = productQty;
    }

    public String getProductName(){ return productName; }

    public void setProductName(String productName) { this.productName = productName; }

    public String getProductID() { return productID; }

    public void setProductID(String productID) { this.productID = productID; }

    public int getProductPrice() { return productPrice; }

    public void setProductPrice(int productPrice) { this.productPrice = productPrice;}

    public int getProductImage() { return productImage;}

    public void setProductImage(int productImage) { this.productImage = productImage;}

    public int getProductQty() { return productQty;}

    public void setProductQty(int productQty) { this.productQty = productQty;}

}













//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_product);
//    }
//}