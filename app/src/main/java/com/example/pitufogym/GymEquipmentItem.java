package com.example.pitufogym;

public class GymEquipmentItem {

    private final String title;
    private final String description;

    public GymEquipmentItem(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}