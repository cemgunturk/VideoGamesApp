package com.example.videogamesapp.Models;

public class DetailsModel {

    private String image, name, date, explanation;

    @Override
    public String toString() {
        return "DetailsModel{" +
                "image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", explanation='" + explanation + '\'' +
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
