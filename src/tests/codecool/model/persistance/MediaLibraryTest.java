package tests.codecool.model.persistance;

import org.junit.After;
import org.junit.Before;
import tests.codecool.model.Manager;
import tests.codecool.model.User;
import tests.codecool.model.mediaItems.Book;
import tests.codecool.model.mediaItems.MediaItem;
import tests.codecool.model.mediaItems.Movie;
import tests.codecool.model.mediaItems.MusicCD;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MediaLibraryTest {
    MediaLibrary lib;
    Manager manager;
    User user;
    MediaItem item1;
    MediaItem item2;
    MediaItem item3;

    @Before
    public void setUp() throws Exception {
        item1 = new Book("Terry Pratchett", "20.03.2009",  "Night Watch", 340);
        item2 = new Movie("Tarantino", "27.02", "Pulp Fiction", 120  );
        item3 = new MusicCD("Rammstein", "1996", "Sensucht", 120);

        lib = new MediaLibrary();
        manager = new Manager("manager1");
        user = new User("user1");

        ArrayList<MediaItem> items = new ArrayList<MediaItem>( Arrays.asList(item1, item2, item3));
        lib.addItems(items);
        }


    @After
    public void tearDown() throws Exception {
    }


    @org.junit.Test
    public void findItem() {
        MediaItem found = lib.findItem(item1);

        assertEquals(item1, found);
    }


    @org.junit.Test
    public void testAddItemByManager() {
        MediaItem book = new Book("Martin Robert C", "2012", "Clean Code", 350);
        lib.add(book, manager);

        assertEquals(book, lib.findItem(book));
    }

    @org.junit.Test
    public void testAddItemByUser() {
        MediaItem book = new Book("Jacek Kaczmarski", "2012", "Plaza dla psow", 350);
        lib.add(book, user);

        assertEquals(null, lib.findItem(book));
    }

    @org.junit.Test
    public void removeItemByManager() {
        lib.removeItem(item1, manager);

        assertEquals(null, lib.findItem(item1));
    }


    @org.junit.Test
    public void removeItemByUser() {
        lib.removeItem(item1, user);
        assertEquals(item1, lib.findItem(item1));
    }


    @org.junit.Test
    public void editItemTitle() {
        String newTitle = "NewTitle";
        lib.editItemTitle(item1, manager, newTitle);
        MediaItem result = lib.findItem(item1);
        assertEquals(newTitle, result.getTitle());

    }


//    @org.junit.Test
//    public void editItem() {
//        String newAuthor = "newAuthor";
//        String newTitle = "newTitle";
//        String newDate = "2010";
//        int newLength = 120;
//        boolean newAvail  = false;
//        lib.editItemData(item1, manager, newAuthor, newTitle, newDate, newLength, newAvail);
//
//        MediaItem editedItem = lib.findItem(item1);
//
//        assertEquals(newAuthor, editedItem.getAuthor());
//        assertEquals(newTitle, editedItem.getTitle());
//        assertEquals(newDate, editedItem.getReleaseDate());
//        assertEquals(newLength, editedItem.getLength());
//        assertEquals(newAvail, editedItem.isAvailable());
//
//    }


    @org.junit.Test
    public void rent() {
    }

    @org.junit.Test
    public void findItemsbyAuthor() {
    }

    @org.junit.Test
    public void findItembyTitle() {
    }

    @org.junit.Test
    public void findItembyLength() {
    }

    @org.junit.Test
    public void findItembyDate() {
    }


}