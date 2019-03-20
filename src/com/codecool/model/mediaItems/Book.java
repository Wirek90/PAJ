package com.codecool.model.mediaItems;

public class Book extends MediaItem implements Readable {
    @Override
    public void read() {

    }

    public Book(String author, String releaseDate, int length) {
        super(author, releaseDate, length);
    }
}
