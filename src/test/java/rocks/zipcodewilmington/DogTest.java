package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test // Compare setNameTest with CatTest
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

    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak(){
        Dog dog = new Dog(null, null, null);
        Assert.assertEquals("bark!", dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testCatBirthDate(){
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();
        dog.setBirthDate(expected);
        Assert.assertEquals(expected, dog.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatFoodEaten(){
        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        dog.eat(food);
        int eaten = dog.getNumberOfMealsEaten();
        Assert.assertEquals(1, eaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testDogId(){
        Dog dog = new Dog(null, null, 5);
        int actual = dog.getId();
        Assert.assertEquals(5, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOf1(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instance2(){
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
