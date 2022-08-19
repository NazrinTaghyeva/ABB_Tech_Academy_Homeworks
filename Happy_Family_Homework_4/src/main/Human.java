package main;

import java.util.Arrays;

public class Human {
    String name;
    String surName;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human(String name, String surName, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surName, Human mother, Human father) {
        this.name = name;
        this.surName = surName;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surName, int year) {
        this.name = name;
        this.surName = surName;
        this.year = year;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Hello " + pet.nickName);
    }

    public void describePet() {
        String sly = " ";

        if (pet.trickLevel > 50) {
           sly = "very sly";
        }else {
            sly= "almost not sly";
        }
        System.out.println("I have " + pet.species + ", he is " + pet.age + " years old," + " he is " + sly);
    }

    public String toString(){
        return "Human{ name=" + this.name + ",surName=" + this.surName +
                ",year=" +  this.year + ",iq= " + this.iq + ",mother=" +
                mother.name + " " + mother.surName + ",father=" +
                father.name + " " + father.surName + ",pet=" + pet.toString() + " }";
    }
}
