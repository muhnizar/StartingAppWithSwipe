package com.example.muhnizar.shoppingCart;

import android.graphics.drawable.Drawable;

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;

    public Product(String title, Drawable productImage, String description,
                   double price) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
    }
}
