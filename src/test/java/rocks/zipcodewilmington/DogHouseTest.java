package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        // When
        DogHouse.add(animal);
        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveDogId(){
        Dog dog = new Dog(); // creating a dog
        DogHouse.add(dog); // adding a dog
        Integer expected = 0; // argument to be compared with
        System.out.println(dog.getId());
        DogHouse.remove(dog.getId()); // removing a dog, specifically by id
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveDog(){
        Dog dog = new Dog(); // creating a dog
        DogHouse.add(dog); // adding a dog
        Integer expected = 0; // argument to be compared with
        DogHouse.remove(dog); // removing a dog
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogId() {
        Dog dog = new Dog(); // creating a dog
        DogHouse.getDogById(0); // adding a dog
        Integer expected = 0; // making sure a dog got added to the house
        Assert.assertEquals(expected, dog.getId()); // comparing expected with actual
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDog() {
        Dog dog = new Dog(); // creating a dog
        DogHouse.add(dog); // adding a dog
        Integer expected = 1; // making sure a dog got added to the house
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs()); // comparing expected with actual
    }

//    @Test
//    public void testGetNumberOfDogs() {
//        // Given (some
//        String name = "Milo";
//        Date birthDate = new Date();
//        Dog animal = AnimalFactory.createDog(name, birthDate);
//        DogHouse.clear();
//
//        // When
//        DogHouse.add(animal);
//
//        // Then
//        DogHouse.getNumberOfDogs();
//    }
}
