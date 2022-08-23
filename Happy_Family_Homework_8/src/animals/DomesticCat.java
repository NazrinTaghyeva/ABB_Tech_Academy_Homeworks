package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

public class DomesticCat extends Pet implements Foul {

    @Override
    public void foul() {
        System.out.println("DomesticCat....");
    }
    public DomesticCat(AnimalSpeciesEnum species, String nickName, int age, int trickLevel, String[] habits) {
        super(species, nickName, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("DomesticCat respond...");
    }
}
