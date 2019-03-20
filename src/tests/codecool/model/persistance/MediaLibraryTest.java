package tests.codecool.model.persistance;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MediaLibraryTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(MediaLibrary.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void add() {
    }

    @org.junit.Test
    public void removeItem() {
    }

    @org.junit.Test
    public void editItem() {
    }

    @org.junit.Test
    public void findItem() {
    }

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

    @org.junit.Test
    public void editItemTitle() {
    }
}
