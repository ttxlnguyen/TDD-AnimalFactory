package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDog(){
        AnimalFactory factory = new AnimalFactory();
        Dog dog = factory.createDog("Tofu", new Date());

        Assert.assertEquals("Tofu", dog.getName());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCat(){
        AnimalFactory factory = new AnimalFactory();
        Cat cat = factory.createCat("Miko", new Date());

        Assert.assertEquals("Miko", cat.getName());
    }

}
