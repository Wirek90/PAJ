package com.codecool.model.mediaItems;

public class Movie extends MediaItem implements Watchable {
    @Override
    public void watch() {

    }

    public Movie(String author, String releaseDate, int length) {
        super(author, releaseDate, length);
    }
}
