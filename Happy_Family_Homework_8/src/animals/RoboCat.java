package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

public class RoboCat extends Pet implements Foul {

    @Override
    public void foul() {
        System.out.println("RoboCat...");
    }
    public RoboCat(AnimalSpeciesEnum species, String nickName, int age, int trickLevel, String[] habits) {
        super(species, nickName, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("RoboCat Respond......");
    }
}
