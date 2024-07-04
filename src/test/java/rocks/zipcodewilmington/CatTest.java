package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testCatName(){
        Cat cat = new Cat(null, null, null);
        cat.setName("Miko");
        Assert.assertEquals("Miko", cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void testCatSpeak(){
        Cat cat = new Cat(null, null, null);
        Assert.assertEquals("meow!", cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testCatBirthDate(){
        Cat cat = new Cat(null, null, null);
        Date expected = new Date();
        cat.setBirthDate(expected);
        Assert.assertEquals(expected, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatFoodEaten(){
        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        cat.eat(food);
        int eaten = cat.getNumberOfMealsEaten();
        Assert.assertEquals(1, eaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testCatId(){
        Cat cat = new Cat(null, null, 5);
        int actual = cat.getId();
        Assert.assertEquals(5, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOf1(){
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instance2(){
        Cat cat = new Cat(null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
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
}
