package com.example.videogamesapp.Models;

public class InfoModel {

    private String image,name,text;

    @Override
    public String toString() {
        return "InfoModel{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
