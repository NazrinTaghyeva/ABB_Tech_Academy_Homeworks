package test;

import animals.Dog;
import enums.AnimalSpeciesEnum;
import enums.DaysOfWeekEnum;
import main.Family;
import main.Human;
import abstractClasses.Pet;
import org.testng.annotations.Test;

import java.util.*;

import static org.testng.Assert.assertEquals;

public class FamilyTest {

    Set<String> habits = new HashSet<>();
    Map<DaysOfWeekEnum, String> schedule =new HashMap<>();
    Pet pet = new Dog(AnimalSpeciesEnum.DOG,"Cookie",2,84, habits);
    Human mother = new Human("Kate","Gomez" , 1975);
    Human father = new Human("John","Gomez" , 1970);
    Family family = new Family(mother,father);
    @Test
    public void objectCheck(){

        schedule.put(DaysOfWeekEnum.FRIDAY,"watch the film");
        habits.add("eating");
        habits.add("playing");
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,schedule,family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,schedule,family);


        Human mother = new Human("Kate","Gomez" , 1975);
        Human father = new Human("John","Gomez" , 1970);
        Family family = new Family(mother,father);
        Family newFamily = new Family(mother,father);
        assertEquals(family,newFamily);
    }

    @Test
    public void addChildCheck(){
        schedule.put(DaysOfWeekEnum.FRIDAY,"watch the film");
        habits.add("eating");
        habits.add("playing");
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,schedule,family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,schedule,family);
        Family family = new Family(mother,father);
        family.addChild(child);
    }

    @Test
    public void deleteChildCheck(){
        schedule.put(DaysOfWeekEnum.FRIDAY,"watch the film");
        habits.add("eating");
        habits.add("playing");
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,schedule,family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,schedule,family);
        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(0);

    }

    @Test
    public void countFamilyMembers(){
        schedule.put(DaysOfWeekEnum.FRIDAY,"watch the film");
        habits.add("eating");
        habits.add("playing");
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,schedule,family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,schedule,family);
        Family family = new Family(mother,father);
        family.addChild(child);
        family.addChild(child2);
        family.deleteChild(0);
        family.countFamily();
        assertEquals(3, family.countFamily());
    }



}