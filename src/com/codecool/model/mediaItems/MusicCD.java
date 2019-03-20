package com.codecool.model.mediaItems;

public class MusicCD extends MediaItem implements Listenable {
    @Override
    public void listen() {

    }

    public MusicCD(String author, String releaseDate, int length) {
        super(author, releaseDate, length);
    }
}
