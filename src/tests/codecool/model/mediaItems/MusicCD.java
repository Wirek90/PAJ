package tests.codecool.model.mediaItems;

public class MusicCD extends MediaItem implements Listenable {
    @Override
    public void listen() {

    }

    public MusicCD(String author, String releaseDate, String title, int length) {
        super(author, releaseDate, title, length);
    }

    @Override
    public void setAvailability(boolean b) {
        this.available = b;
    }
}
