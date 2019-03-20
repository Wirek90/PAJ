package com.codecool.model.mediaItems;

abstract public class MediaItem {
    String author;
    String releaseDate;
    int length;


    public MediaItem(String author, String releaseDate, int length) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.length = length;

    }




}
