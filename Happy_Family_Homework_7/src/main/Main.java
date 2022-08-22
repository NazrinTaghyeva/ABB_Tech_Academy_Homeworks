package main;
import abstractClasses.Pet;
import animals.Dog;
import enums.AnimalSpeciesEnum;
import enums.DaysOfWeekEnum;
import manVsWoman.Man;
import manVsWoman.Woman;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//       Pet pet = new Pet(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
         Pet pet = new Dog(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
        System.out.println(pet.toString());
        System.out.println(pet);
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
        System.out.println("Count of family members: " + family.countFamily());

        Human man =new Man("John","Gomez" , 1970,50,family);
        System.out.println(man);
        man.greetPet();
        ((Man) man).repairCar();
        System.out.println( man.getName());
    }
}