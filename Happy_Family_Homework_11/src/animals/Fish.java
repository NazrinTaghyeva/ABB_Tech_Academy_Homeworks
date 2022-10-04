package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

import java.util.Set;

public class Fish extends Pet  implements Foul {
    public Fish(
            String nickname,
            int age,
            int trickLevel,
            Set<String> habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(AnimalSpeciesEnum.FISH);
    }



    @Override
    public void foul() {

    }

    @Override
    protected void respond() {

    }
}
