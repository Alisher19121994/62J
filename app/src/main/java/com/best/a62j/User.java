package com.best.a62j;
public class User {
    String title;
    int image;

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public User(String title, int image) {
        this.title = title;
        this.image = image;
    }
}
