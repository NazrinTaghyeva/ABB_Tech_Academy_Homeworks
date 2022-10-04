package animals;

import abstractClasses.Pet;
import enums.AnimalSpeciesEnum;
import interfaces.Foul;

import java.util.Set;

     class DomesticCat extends Pet implements Foul {
    public DomesticCat(
            String nickname,
            int age,
            int trickLevel,
            Set<String> habits
    ) {
        super(nickname,age,trickLevel,habits);
        super.setSpecies(AnimalSpeciesEnum.DOMESTICCAT);
    }

         @Override
         protected void respond() {

         }

         @Override
    public void foul() {

    }


}
