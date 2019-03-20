package com.codecool.model.mediaItems;

abstract public class MediaItem {
    String author;

    String releaseDate;
    String title;
    int length;
    boolean available;


    public MediaItem(String author, String releaseDate, String title, int length) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.title = title;
        this.length = length;
        this.available = true;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitle(String title) {
    }

    public boolean isAvailable() {
        return available;
    }

    public abstract void setAvailability(boolean b);




}
