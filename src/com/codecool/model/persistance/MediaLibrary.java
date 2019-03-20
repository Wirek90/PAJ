package com.codecool.model.persistance;

import com.codecool.model.User;
import com.codecool.model.mediaItems.Book;
import com.codecool.model.mediaItems.MediaItem;
import com.codecool.model.mediaItems.Movie;
import com.codecool.model.mediaItems.MusicCD;

import java.util.ArrayList;
import java.util.Arrays;

public class MediaLibrary {

    private ArrayList<MediaItem> items = (ArrayList<MediaItem>) Arrays.asList(
            new Book("Terry Pratchett", "20.03.2009",  "Night Watch", 340),
            new Movie("Tarantino", "27.02", "Pulp Fiction", 120  ),
            new MusicCD("Rammstein", "1996", "Sensucht", 120)
    );

    public void add(MediaItem item, User user) {
            items.add(item);
        }

        public void removeItem(MediaItem item, User user) {
            if (items.contains(item)) {
                items.remove(item);
            }
        }


        public void editItem(MediaItem item, User user) {

        }


    public MediaItem findItem(MediaItem item) {
        for (MediaItem i : items) {
            if (i.equals(item)) {
                return i;
            }
        }
        return null;
    }

    public void rent(MediaItem item) {
        MediaItem i = findItem(item);
        i.setAvailability(false);

    }



}




