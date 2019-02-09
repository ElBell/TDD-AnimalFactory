package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private Cat testCat;

    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Before
    public void setup() {
        this.testCat =  new Cat("FirstName", new Date(0), 1);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        // Given (Cat with a name and a different name)
        String catName = "NewName";

        // When (setName() is called)
        testCat.setName(catName);

        //Then
        Assert.assertEquals("NewName", testCat.getName());
    }

    @Test
    public void testSpeak() {
        //Given (cat created before)
        //When (speak is called)
        String retrievedSound = testCat.speak();

        //Then
        Assert.assertEquals("meow!", retrievedSound);

    }

    @Test
    public void testSetBirthDate() {
        //Given (cat created before and new BirthDate)
        Date newDate = new Date(1/1/1);
        //When (setBirthDate() is called)
        testCat.setBirthDate(newDate);
        //Then
        Assert.assertEquals(testCat.getBirthDate(), newDate);
    }

    @Test
    public void testEat() {
        //Given (cat created before and new BirthDate)
        Integer startingMeals = testCat.getNumberOfMealsEaten();
        Integer endingMeals = startingMeals + 1;
        System.out.println(startingMeals);
        //When (eat() is called)
        Food kumqat = new Food();
        testCat.eat(kumqat);
        //Then
        Assert.assertEquals(testCat.getNumberOfMealsEaten(), endingMeals);
    }

    @Test
    public void testGetId() {
        //Given (cat created before)
        //When (getId() is called)
        int calledID = testCat.getId();
        //Then
        Assert.assertEquals(calledID, 1);
    }

    @Test
    public void testInstanceOfAnimal() {
        //Given (cat created before)
        //When
        boolean isAnimal = testCat instanceof Animal;
        //Then
        Assert.assertEquals(isAnimal, true);
    }

    @Test
    public void testInstanceOfMammal() {
        //Given (cat created before)
        //When
        boolean isMammal = testCat instanceof Mammal;
        //Then
        Assert.assertEquals(isMammal, true);
    }

}

