package test;

import enums.AnimaSpeciesEnum;
import main.Pet;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class PetTest {
    public Pet pet = new Pet(AnimaSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});

    @Test
    public void checkPet(){
        Pet pet1 = new Pet(AnimaSpeciesEnum.RABBIT,"Sirius",2,92, new String[]{"running","sleeping"});
        assertNotEquals(pet,pet1);
    }

}
