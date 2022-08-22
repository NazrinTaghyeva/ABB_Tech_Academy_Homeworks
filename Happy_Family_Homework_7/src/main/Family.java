package main;

import abstractClasses.Pet;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    }

    public Family() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Arrays.equals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }

    public void addChild(Human child) {
        int len = getChildren().length;
        Human[] newChildArr = new Human[len + 1];
        for (int i = 0; i <= len; i++) {
            if (i == len) {
                newChildArr[i] = child;
                break;
            }
            newChildArr[i] = getChildren()[i];
        }
        setChildren(newChildArr);
    }

    public void deleteChild(int index) {
        int len = getChildren().length;
        Human[] children = new Human[len - 1];
        if (len == 0) {
            System.out.println("No children");
        } else {
            for (int i = 0, ch = 0; i < len; i++) {
                if (index == i) {
                    continue;
                }
                children[ch++] = getChildren()[i];
            }
            setChildren(children);
        }

    }

    public int countFamily() {
        int len = 0;
        for (int i = 0; i < children.length; i++) {
            if (!(children[i] == null)) {
                len++;
            }
        }
        return len + 2;
    }



    protected void finalize(){
        System.out.println("Mother and father i removed" + mother.getMother() + father.getFather());
    }
    public String toString() {
        return "Family{ mother=" +
                mother.getName() + " " + mother.getSurName() + ",father=" +
                father.getName() + " " + father.getSurName() + " children= " + Arrays.toString(this.children) + " }";
    }
}