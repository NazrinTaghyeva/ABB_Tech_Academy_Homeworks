package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

public class Fish extends Pet  implements Foul {
    @Override
    public void respond() {
        System.out.println("Fish Respond.........");
    }

    public Fish(AnimalSpeciesEnum species, String nickName, int age, int trickLevel, String[] habits) {
        super(species, nickName, age, trickLevel, habits);
    }

    @Override
    public void foul() {
        System.out.println("Fish no foul..........");
    }
}
