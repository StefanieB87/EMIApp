package com.example.adria.note10;

/**
 * Created by adria on 16.12.2016.
 */

public enum Category {
    UNI("#FFFFF"), EINKAUF("#FFFFFF"), TODO("#FFF"), ALLGEMEIN("#F");
    private String color;
    private Category (String color) {
        this.color = color;
    }


}
