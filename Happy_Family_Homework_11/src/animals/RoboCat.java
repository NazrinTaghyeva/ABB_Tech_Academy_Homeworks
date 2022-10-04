package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

import java.util.Set;

public class RoboCat extends Pet implements Foul {
    public RoboCat(
            String nickname,
            int age,
            int trickLevel,
            Set<String> habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(AnimalSpeciesEnum.ROBOCAT);
    }

    @Override
    protected void respond() {

    }


    @Override
    public void foul() {

    }
}
