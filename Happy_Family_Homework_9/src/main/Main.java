package main;

import abstractClasses.Pet;
import animals.Dog;
import animals.Fish;
import dao.CollectionFamilyDao;
import dao.FamilyController;
import dao.FamilyService;
import enums.AnimalSpeciesEnum;
import enums.DaysOfWeekEnum;
import manVsWoman.Man;
import manVsWoman.Woman;

import java.time.DayOfWeek;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//      Pet pet = new Pet(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
        Set <String> habits = new HashSet<>();
        habits.add("Eating");
        habits.add("sleeping");

        Pet pet = new Fish("Cookie", 5, 25, habits);
        Human mother = new Human("Selena", "Gomez", 1905);
        Human father = new Human("Jhon", "Gomez", 1940);
        Human mother1 = new Human("Lucy", "Bieber", 1965);
        Human father1 = new Human("Tom", "Bieber", 1960);
        Family family = new Family(mother, father);
        Family family1 = new Family(mother1,father1);
        System.out.println("-----");




        Map<String,String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.SUNDAY.name(), "do home work");
        mother.setSchedule(schedule);
        mother1.setSchedule(schedule);
        Human child = new Human("Kate", "Gomez", 1977,
                95, schedule,family);
        Human child1 = new Human("Rosy", "Bieber", 1993,
                93, schedule,family1);
        Set<Pet> pet2 = new HashSet<>();
        pet2.add(pet);
        family.setPet(pet2);
        family1.setPet(pet2);
        Man man = new Man();
        Woman woman = new Woman();

        family.addChild(child);
        family.countFamily();
        System.out.println(child.getFamily());
        System.out.println(family);

        family.deleteChild(child);
        System.out.println(family);
        family.countFamily();

        family1.addChild(child1);
        family1.countFamily();
        System.out.println(child1.getFamily());
        System.out.println(family1);


        System.out.println();


        FamilyController familyController = new FamilyController(new FamilyService(new CollectionFamilyDao()));

        Family family01 = familyController.createNewFamily(mother,father);
        Family family02 = familyController.createNewFamily(mother1,father1);
        familyController.addPet(0,pet);
        familyController.displayAllFamilies();
        System.out.println(familyController.getFamiliesBiggerThan(1));
        System.out.println(familyController.getFamiliesLessThan(10));
        System.out.println(familyController.countFamiliesWithMemberNumber(2));
        System.out.println("-----");


        for (int i = 0; i < 10000; i++) {
            Human human = new Human();
        }

    }


}