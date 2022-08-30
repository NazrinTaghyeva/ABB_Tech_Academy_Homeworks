package test;

import animals.Dog;
import animals.Fish;
import enums.AnimalSpeciesEnum;
import abstractClasses.Pet;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class PetTest {
    Set<String> habits = new HashSet<>();

    @Test
    public void checkPet(){
        habits.add("eating");
        habits.add("playing");
        Pet pet = new Dog(AnimalSpeciesEnum.DOG,"Cookie",2,84,habits);
        Pet pet1 = new Fish(AnimalSpeciesEnum.FISH,"Sirius",2,92, habits);
        assertNotEquals(pet,pet1);
    }

}