package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

import java.util.Set;

 public class Dog extends Pet implements Foul {

    public Dog(
            String nickname,
            int age,
            int trickLevel,
            Set<String> habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(AnimalSpeciesEnum.DOG);
    }

     @Override
     protected void respond() {

     }

     @Override
    public void foul() {

    }
}
