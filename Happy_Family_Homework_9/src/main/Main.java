package main;

import abstractClasses.Pet;
import animals.Dog;
import dao.CollectionFamilyDao;
import dao.FamilyController;
import dao.FamilyDao;
import dao.FamilyService;
import enums.AnimalSpeciesEnum;
import enums.DaysOfWeekEnum;
import manVsWoman.Man;
import manVsWoman.Woman;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//      Pet pet = new Pet(AnimalSpeciesEnum.DOG,"Cookie",2,84, new String[]{"eating","playing"});
        Set<String> habits = new HashSet<>();
        habits.add("eating");
        habits.add("playing");
        Pet pet = new Dog(AnimalSpeciesEnum.DOG, "Cookie", 2, 84, habits);
        System.out.println(pet.toString());
        Human mother = new Human("Kate", "Gomez", 1975);
        Human father = new Human("John", "Gomez", 1970);
        Family family = new Family(mother, father);

        Map<DaysOfWeekEnum, String> schedule =new HashMap<>();
        schedule.put(DaysOfWeekEnum.FRIDAY,"watch the film");
        Human child = new Human("Selena", "Gomez", 2002, 85, pet, mother, father, schedule, family);
        Human child2 = new Human("Rosy", "Gomez", 2005, 47, pet, mother, father,schedule, family);
        System.out.println(child.toString());
        System.out.println(family.toString());
        family.addChild(child);
        family.addChild(child2);

        family.addChild(child);
        System.out.println(family);
        family.deleteChild(2);
        System.out.println(family);
        System.out.println("Count of family members: " + family.countFamily());

        Human[] human = new Human[]{
                new Man("John", "Gomez", 1970, 50, new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT), "meet the friends"}}),
                new Woman("Selena", "Gomez", 1970, 50, new String[][]{{DaysOfWeekEnum.FRIDAY.name().toLowerCase(Locale.ROOT), "meet the friends"}})
        };

        for (int i = 0; i < human.length; i++) {
            System.out.println(human[i]);
        }
        System.out.println("**************************************************************");


        FamilyController controller = new FamilyController(new FamilyService(new CollectionFamilyDao()));
        controller.createNewFamily(mother,father);
        controller.displayAllFamilies();

        System.out.println( controller.count());
    }
}