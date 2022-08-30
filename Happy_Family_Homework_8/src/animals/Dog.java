package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

import java.util.Set;

public class Dog extends Pet implements Foul {

    @Override
    public void respond() {
        System.out.println("Dog respond.....");
    }

    public Dog(AnimalSpeciesEnum species, String nickName, int age, int trickLevel,  Set<String> habits) {
       super(species, nickName, age, trickLevel, habits);
    }

    @Override
    public void foul() {
        System.out.println("Dog Foul....");
    }
}
