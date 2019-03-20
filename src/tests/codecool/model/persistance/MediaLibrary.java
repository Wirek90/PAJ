package tests.codecool.model.persistance;

import tests.codecool.model.Manager;
import tests.codecool.model.User;
import tests.codecool.model.mediaItems.MediaItem;

import java.util.ArrayList;

public class MediaLibrary {

    private ArrayList<MediaItem> items = new ArrayList<>();



    public void add(MediaItem item, User user) {
        if (user instanceof Manager) {
            items.add(item);
        }
    }



    public void addItems(ArrayList <MediaItem> items) {
        this.items = items;
    }


    public void removeItem(MediaItem item, User user) {
            if (user instanceof Manager && items.contains(item)) {
                items.remove(item);
            }
        }


        public void editItemData(MediaItem item, User user, String author, String title, String date, int length, boolean availability) {
            if (user instanceof Manager && items.contains(item)) {
                MediaItem i = findItem(item);
                int idx = items.indexOf(item);
                items.get(idx).setAuthor(author);
                i.setTitle(title);
                i.setReleaseDate(date);
                i.setLength(length);
                i.setAvailability(availability);

                items.set(idx, i);


            }

        }

    public void editItemAuthor(MediaItem item, User user, String author) {
        if (user instanceof Manager && items.contains(item)) {
            int idx = items.indexOf(item);
            items.get(idx).setAuthor(author);
        }
    }

    public void editItemReleaseDate(MediaItem item, User user, String date) {
        if (user instanceof Manager && items.contains(item)) {
            int idx = items.indexOf(item);
            item.setReleaseDate(date);
            items.set(idx, item);
        }
    }


    public void editItemLength(MediaItem item, User user, int length) {
        if (user instanceof Manager && items.contains(item)) {
            int idx = items.indexOf(item);
            item.setLength(length);
            items.set(idx, item);
        }
    }


    public void editItemTitle(MediaItem item, User user, String title) {
        if (user instanceof Manager && items.contains(item)) {
            int idx = items.indexOf(item);
            item.setTitle(title);
            items.set(idx, item);
        }
    }


    public void editItemAvailability(MediaItem item, User user, boolean availability) {
        if (user instanceof Manager && items.contains(item)) {
            int idx = items.indexOf(item);
            item.setAvailability(availability);
            items.set(idx, item);
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

    public MediaItem findItemsbyAuthor(String author) {
        return null;
    }


    public MediaItem findItembyTitle(String title) {
        return null;
    }

    public MediaItem findItembyLength (int length) {
        return null;
    }

    public MediaItem findItembyDate (int length) {
        return null;
    }

    public void editItemTitle(User user, MediaItem item, String title) {
        if (user instanceof Manager) {
            MediaItem i = findItem(item);
            i.setTitle(title);
        }
    }

    public void printItems() {
        for (MediaItem item : items) {
            System.out.print(item.getAuthor());
        }
    }
}




