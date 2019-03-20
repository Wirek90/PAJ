package com.codecool.model.mediaItems;

abstract public class MediaItem {
    String author;
    String releaseDate;
    String title;
    int length;
    boolean available = true;


    public MediaItem(String author, String releaseDate, String title, int length) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.title = title;
        this.length = length;

    }


    public abstract void setAvailability(boolean b);

}
