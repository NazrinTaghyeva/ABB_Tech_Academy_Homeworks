package main;

import enums.AnimaSpeciesEnum;

import java.util.Arrays;

public class Pet {
    private AnimaSpeciesEnum species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public AnimaSpeciesEnum getSpecies() {
        return species;
    }

    public void setSpecies(AnimaSpeciesEnum species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }



    public Pet(AnimaSpeciesEnum species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(AnimaSpeciesEnum species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public Pet() {
    }

    public void eat() {
        System.out.println("I'm eating.....");
    }

    public void respond() {
        System.out.println("Hello owner...I'm - " + this.nickName + ".I miss you");
    }

    public void foul() {
        System.out.println("I need to cover it up...");
    }

    protected void finalize() {
        System.out.println("NickName and species is removed..." + nickName + species);
    }

    public String toString() {
        return this.species + "{ nickName=" + this.nickName + ",age=" + this.age +
                " trickLevel=" + this.trickLevel + ",habits=" + Arrays.toString(this.habits) + " }";
    }
}