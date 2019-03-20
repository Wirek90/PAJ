package com.codecool.model.mediaItems;

public class Book extends MediaItem implements Readable {
    @Override
    public void read() {

    }

    public Book(String author, String releaseDate, String title, int length) {
        super(author, releaseDate, title, length);


    }

    @Override
    public void setAvailability(boolean b) {
        this.available = b;
    }
}
