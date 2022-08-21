package main;
import enums.AnimaSpeciesEnum;
import enums.DaysOfWeekEnum;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet(AnimaSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
        System.out.println(pet.toString());
        Human mother = new Human("Kate","Gomez" , 1975);
        Human father = new Human("John","Gomez" , 1970);
        Family family = new Family(mother,father);
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{DaysOfWeekEnum.MONDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.SUNDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);

        System.out.println(child.toString());
        System.out.println(family.toString());
        family.addChild(child);
        family.addChild(child2);

        family.addChild(child);
        System.out.println(family);
        family.deleteChild(2);
        System.out.println(family);
        System.out.println(family.countFamily());

        pet.respond();
        pet.eat();
        pet.foul();


    }
}
