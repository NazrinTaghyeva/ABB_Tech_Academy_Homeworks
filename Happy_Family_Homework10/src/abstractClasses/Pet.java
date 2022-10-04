package abstractClasses;

import animals.Dog;
import enums.AnimalSpeciesEnum;
import enums.AnimalSpeciesEnum;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private AnimalSpeciesEnum species;
    private String nickname;
    private Set<String> habits;
    private int age;
    private int trickLevel;


    public Pet(
            String nickname,
            int age,
            int trickLevel,
            Set<String> habits
    ) {
        this.nickname = nickname;
        this.habits = habits;
        this.age = age;
        this.trickLevel = trickLevel;
        this.setSpecies(AnimalSpeciesEnum.UNKNOWN);
    }


    public Pet() {
    }

    public Pet(AnimalSpeciesEnum species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public void setSpecies(AnimalSpeciesEnum species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public AnimalSpeciesEnum getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", habits=" + habits +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                '}';
    }

    void eat() {
        System.out.println("I am eating");

    }

    ;

    protected abstract void respond();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet1 = (Pet) o;
        return age == pet1.age && trickLevel == pet1.trickLevel && species == pet1.species && nickname.equals(pet1.nickname) && habits.equals(pet1.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, habits, age, trickLevel);
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Remove pet");
        super.finalize();
    }
}