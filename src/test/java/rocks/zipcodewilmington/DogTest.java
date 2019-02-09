package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog testDog;
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Before
    public void setup() {this.testDog = new Dog("Spot", new Date(0), 1);}

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSpeak() {
        // Given (a testDog created before)
        //When (speak is called)
        String retrievedSound = testDog.speak();

        //Then
        Assert.assertEquals("bark!", retrievedSound);
    }

    @Test
    public void testSetBirthDate() {
        //Given (cat created before and new BirthDate)
        Date newDate = new Date(1/1/1);
        //When (setBirthDate() is called)
        testDog.setBirthDate(newDate);
        //Then
        Assert.assertEquals(testDog.getBirthDate(), newDate);
    }


    @Test
    public void testEat() {
        //Given (cat created before and new BirthDate)
        Integer startingMeals = testDog.getNumberOfMealsEaten();
        Integer endingMeals = startingMeals + 1;
        System.out.println(startingMeals);
        //When (eat() is called)
        Food kibble = new Food();
        testDog.eat(kibble);
        //Then
        Assert.assertEquals(testDog.getNumberOfMealsEaten(), endingMeals);
    }

    @Test
    public void testGetId() {
        //Given (cat created before)
        //When (getId() is called)
        int calledID = testDog.getId();
        //Then
        Assert.assertEquals(calledID, 1);
    }

    @Test
    public void testInstanceOfAnimal() {
        //Given (cat created before)
        //When
        boolean isAnimal = testDog instanceof Animal;
        //Then
        Assert.assertEquals(isAnimal, true);
    }

    @Test
    public void testInstanceOfMammal() {
        //Given (cat created before)
        //When
        boolean isMammal = testDog instanceof Mammal;
        //Then
        Assert.assertEquals(isMammal, true);
    }

}
