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




    public abstract void setAvailability(boolean b);

    public void setTitle(String title) {
    }



}
