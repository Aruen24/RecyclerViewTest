package com.example.administer.recyclerviewtest;

/**
 * Created by administer on 2017/7/20.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit (String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
