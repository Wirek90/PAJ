package tests.codecool.model.mediaItems;

public class Movie extends MediaItem implements Watchable {
    @Override
    public void watch() {

    }

    public Movie(String author, String releaseDate, String title, int length) {
        super(author, releaseDate, title, length);
    }

    @Override
    public void setAvailability(boolean b) {
        this.available = b;
    }
}
