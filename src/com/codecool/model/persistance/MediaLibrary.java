package com.codecool.model.persistance;

import com.codecool.model.Manager;
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
        if (user instanceof Manager) {
            items.add(item);
        }
    }

        public void removeItem(MediaItem item, User user) {

            if (user instanceof Manager && items.contains(item)) {
                items.remove(item);
            }
        }


    public MediaItem findItem(MediaItem item) {
        for (MediaItem i : items) {
            if (i.equals(item)) {
                return i;
            }
        }
        return null;
    }

    public void rent(MediaItem item, User user) {
        MediaItem i = findItem(item);
        i.setAvailability(false);
        user.addToRented(i);

    }

    public boolean isItemAvailable(MediaItem item) {
        return findItem(item).isAvailable();
    }

    public ArrayList<MediaItem> findItemsbyAuthor(String author) {
        return null;
    }


    public ArrayList<MediaItem> findItemsbyTitle(String title) {
        return null;
    }

    public ArrayList<MediaItem> findItemsbyLength (int length) {
        return null;
    }

    public ArrayList<MediaItem> findItemsbyDate (int length) {
        return null;
    }


    public void editItemData(MediaItem item, User user, String author, String title, String date, int length, boolean availability) {
        if (user instanceof Manager && items.contains(item)) {

            MediaItem i = findItem(item);
            i.setTitle(title);
            i.setAuthor(author);
            i.setReleaseDate(date);
            i.setLength(length);
            i.setAvailability(availability);

        }

    }

    public void editItemAuthor(MediaItem item, User user, String author) {
        if (user instanceof Manager && items.contains(item)) {
            MediaItem i = findItem(item);
            i.setAuthor(author);
        }
    }

    public void editItemReleaseDate(MediaItem item, User user, String date) {
        if (user instanceof Manager && items.contains(item)) {
           MediaItem i = findItem(item);
            i.setReleaseDate(date);
        }
    }


    public void editItemLength(MediaItem item, User user, int length) {
        if (user instanceof Manager && items.contains(item)) {
            MediaItem i = findItem(item);
            i.setLength(length);
        }
    }


    public void editItemTitle(MediaItem item, User user, String title) {
        if (user instanceof Manager && items.contains(item)) {
            MediaItem i = findItem(item);
            i.setTitle(title);
        }
    }


    public void editItemAvailability(MediaItem item, User user, boolean availability) {
        if (user instanceof Manager && items.contains(item)) {
            MediaItem i = findItem(item);
            i.setAvailability(availability);
        }
    }

}




