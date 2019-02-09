package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    CatHouse testCatHouse;
    Cat testCat;
    @Before
    public void setup() {this.testCatHouse = new CatHouse(); this.testCat = new Cat("Spot", new Date(1), 0);}

    @Test
    public void testAddCat() {
        // Given (A testCatHouse)
        Integer startingNumber = testCatHouse.getNumberOfCats();
        Integer endingNumber = startingNumber + 1;
        // When we add a Cat to the CatHouse
        testCatHouse.add(testCat);
        //Then
        Assert.assertEquals(testCatHouse.getNumberOfCats(), endingNumber);
    }

    @Test
    public void testRemoveCat() {
        // Given (A testCat is added to the testCatHouse)
        testCatHouse.add(testCat);
        Integer startingNumber = testCatHouse.getNumberOfCats();
        Integer endingNumber = startingNumber - 1;
        // When we add a Cat to the CatHouse
        testCatHouse.remove(testCat);
        //Then
        Assert.assertEquals(testCatHouse.getNumberOfCats(), endingNumber);
    }

    @Test
    public void testRemoveID() {
        // Given (A testCat is added to the  testCatHouse)
        Cat testIDCat = new Cat("ID", new Date(5), 14);
        testCatHouse.add(testIDCat);
        // When we add a Cat to the CatHouse
        testCatHouse.remove(testIDCat);
        boolean catIsThereEnd = testCatHouse.getCatById(testIDCat.getId()) == null;
        //Then
        Assert.assertEquals(catIsThereEnd, true);
    }

    @Test
    public void testGetCatByID() {
        // Given (A test cat is added to the testCatHouse )
        testCatHouse.add(testCat);
        // When (add a Cat to the CatHouse)
        boolean catIsThereEnd = testCatHouse.getCatById(testCat.getId()) == null;
        //Then
        Assert.assertEquals(catIsThereEnd, false);
    }

    @Test
    public void testGetNumberOfCats() {
        // Given (A testCat added to the testCatHouse)
        Cat testCat2 = new Cat("SecondName", new Date(8), 9);
        testCatHouse.add(testCat);
        testCatHouse.add(testCat2);
        //When (getNumberOfCats() is called)
        Integer endNumberOfCats = testCatHouse.getNumberOfCats();
        Integer actualNumberOfCats = 2;
        //Then
        Assert.assertEquals(endNumberOfCats, actualNumberOfCats);
    }
}

