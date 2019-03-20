package com.codecool.model;

import com.codecool.model.mediaItems.MediaItem;

import java.util.ArrayList;

public class User {
    public String username;
    private ArrayList<MediaItem> rentedItems = new ArrayList<>();

    public User(String name) {
        this.username = name;
    }


    public void preview(MediaItem mediaItem){
            }


    public void addToRented(MediaItem item) {
        rentedItems.add(item);
    }


    public void removeFromRented(MediaItem item) {
        rentedItems.remove(item);
    }




}
