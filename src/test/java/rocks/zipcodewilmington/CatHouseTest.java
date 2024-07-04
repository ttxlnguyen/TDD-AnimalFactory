package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Miko";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        // When
        CatHouse.add(animal);
        // Then
        CatHouse.getNumberOfCats();
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveCatsId(){
        Cat cat = new Cat();
        CatHouse.add(cat); // adding a cat
        Integer expected = 0; // argument to be compared with
        System.out.println(cat.getId());
        CatHouse.remove(cat.getId()); // removing a cat, specifically by id
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat(){
        Cat cat = new Cat(); // creating a cat object
        CatHouse.add(cat); // adding a cat
        Integer expected = 0; // argument to be compared with
        CatHouse.remove(cat); // removing a cat
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatId() {
        Cat cat = new Cat(); // creating a cat
        CatHouse.getCatById(0); // adding a cat
        Integer expected = 0; // making sure a cat got added to the house
        Assert.assertEquals(expected, cat.getId()); // comparing expected with actual
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCat() {
        Cat cat = new Cat(); // creating a cat
        CatHouse.add(cat); // adding a cat
        Integer expected = 1; // making sure a cat got added to the house
        Assert.assertEquals(expected, CatHouse.getNumberOfCats()); // comparing expected with actual
    }

}
