package main;

import abstractClasses.Pet;

import java.util.Arrays;

public class Human {
    private String name;
    private String surName;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surName, int year, int iq, Family family) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.family = family;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surName, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule, Family family) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
        this.family = family;
    }

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

    public Human(String name, String surName, int year, int iq) {
        this.name = name;
        this.surName = surName;
        this.year = year;
        this.iq = iq;
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
        System.out.println("Hello " + pet.getNickName());
    }

    public void describePet() {
        String sly = " ";

        if (pet.getTrickLevel() > 50) {
            sly = "very sly";
        } else {
            sly = "almost not sly";
        }
        System.out.println("I have " + pet.getSpecies() + ", he is " + pet.getAge() + " years old," + " he is " + sly);
    }

    public void toWelcomeFavourite(){
        System.out.println("To welcome the favourite.....");
    }
    public void toDescribeFavourite(){
        System.out.println("To describe the favourite.....");
    }
    public void toFeed(){
        System.out.println("To Feed.....");
    }
    protected void finalize(){
        System.out.println("Name and Surname is removed... " + name + surName);
    }
    public void garbageCollector(){
        for (int i = 0; i<1000000; i++){
            Human human =new Human();
        }
    }
    public String toString() {
        return "Human{ name=" + this.name + ",surName=" + this.surName +
                ",year=" + this.year + ",iq= " + this.iq + ",schedule=" + Arrays.deepToString(this.schedule) + "}";
    }
}