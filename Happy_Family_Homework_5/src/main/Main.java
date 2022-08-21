package main;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("Dog","Cookie",2,84, new String[]{"eating","playing"});
        System.out.println(pet.toString());
        Human mother = new Human("Kate","Gomez" , 1975);
        Human father = new Human("John","Gomez" , 1970);
        Family family = new Family(mother,father);
        Human child = new Human("Selena","Gomez",2002,85, pet, mother,father,new String[][]{{"monday","meet the friends"},{"sunday","watch the film"}},family);
        Human child2 = new Human("Rosy","Gomez",2005,47,pet, mother,father,new String[][]{{"monday","meet the friends"},{"sunday","watch the film"}},family);

        System.out.println(child.toString());
        System.out.println(family.toString());
        family.addChild(child);
        family.addChild(child2);

        System.out.println(family);
         family.deleteChild(0);
         System.out.println(family);
        System.out.println(family.countFamily());

        pet.respond();
        pet.eat();
        pet.foul();


    }
}