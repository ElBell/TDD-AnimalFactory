package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    private AnimalFactory testAnimalFactory;
    @Before
    public void setup() {this.testAnimalFactory = new AnimalFactory();}

    @Test
    public void testCreateDog() {
        // Given (An animalFactory created Before)
        // When (createDog() is called)
        Date bday = new Date(1);
        Dog testDog = testAnimalFactory.createDog("TestName", bday);
        //Then
        Assert.assertEquals(testDog.getName(), "TestName");
        Assert.assertEquals(testDog.getBirthDate(), bday);
    }

    @Test
    public void testCreateCat() {
        // Given (An animalFactory created Before)
        // When (createDog() is called)
        Date bday = new Date(1);
        Dog testCat = testAnimalFactory.createDog("TestName", bday);
        //Then
        Assert.assertEquals(testCat.getName(), "TestName");
        Assert.assertEquals(testCat.getBirthDate(), bday);
    }

}
