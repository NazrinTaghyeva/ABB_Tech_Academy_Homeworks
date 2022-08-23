package test;

import animals.Dog;
import animals.Fish;
import enums.AnimalSpeciesEnum;
import abstractClasses.Pet;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class PetTest {
    public Pet pet = new Dog(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});

    @Test
    public void checkPet(){
        Pet pet1 = new Fish(AnimalSpeciesEnum.FISH,"Sirius",2,92, new String[]{"running","sleeping"});
        assertNotEquals(pet,pet1);
    }

}