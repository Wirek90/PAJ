package com.codecool.model;

abstract public class MediaItem {
    String author;
    String releaseDate;
    int length;


    MediaItem(String author, String releaseDate, int length) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.length = length;

    }




}
