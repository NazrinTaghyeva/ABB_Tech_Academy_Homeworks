package main;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Dog","Cookie",2,84, new String[]{"eating","playing"});
        System.out.println(pet.toString());
        Human mother = new Human("Kate","Gomez" , 1975);
        Human father = new Human("John","Gomez" , 1970);
        Human human = new Human("Selena","Gomez",2002,85,pet, mother,father,new String[][]{{"monday"},{"meet the friends"}});
        System.out.println(human.toString());
        human.describePet();
        human.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();
    }
}