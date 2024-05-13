package com.example.pitufogym.ui.home;

public class HomeItem {
    private String imageUrl;
    private String text;

    public HomeItem(String imageUrl, String text) {
        this.imageUrl = imageUrl;
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getText() {
        return text;
    }
}
