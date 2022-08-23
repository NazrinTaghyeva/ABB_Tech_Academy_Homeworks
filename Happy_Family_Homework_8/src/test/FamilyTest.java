package test;

import animals.Dog;
import enums.AnimalSpeciesEnum;
import enums.DaysOfWeekEnum;
import main.Family;
import main.Human;
import abstractClasses.Pet;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.assertEquals;

public class FamilyTest {
    Pet pet = new Dog(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
    Human mother = new Human("Kate","Gomez" , 1975);
    Human father = new Human("John","Gomez" , 1970);
    Family family = new Family(mother,father);
    Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{DaysOfWeekEnum.MONDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.SUNDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
    Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);


    @Test
    public void objectCheck(){
        Human mother = new Human("Kate","Gomez" , 1975);
        Human father = new Human("John","Gomez" , 1970);
        Family family = new Family(mother,father);
        Family newFamily = new Family(mother,father);
        assertEquals(family,newFamily);
    }

    @Test
    public void addChildCheck(){
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{DaysOfWeekEnum.MONDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.SUNDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Family family = new Family(mother,father);
        family.addChild(child);
    }

    @Test
    public void deleteChildCheck(){
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{DaysOfWeekEnum.MONDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.SUNDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Family family = new Family(mother,father);
        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(0);

    }

    @Test
    public void countFamilyMembers(){
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{DaysOfWeekEnum.MONDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.SUNDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT),"meet the friends"},{DaysOfWeekEnum.THURSDAY.name().toLowerCase(Locale.ROOT),"watch the film"}},family);
        Family family = new Family(mother,father);
        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(0);
        family.countFamily();
        assertEquals(3, family.countFamily());
    }



}