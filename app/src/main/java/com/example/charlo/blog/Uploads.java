package com.example.charlo.blog;

public class Uploads {
    private String description;
    private String Price;
    private String mImageUrl;

    public Uploads(){

    }

    public Uploads(String description, String price, String mImageUrl) {
        this.description = description;
        Price = price;
        this.mImageUrl = mImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
