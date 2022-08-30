package main;

import abstractClasses.Pet;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family(Human mother, Human father, List<Human> children, Pet pet) {
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

    public Family(Human mother, Human father, List<Human> children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = List.of(new Human[0]);
    }

    public Family() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Objects.equals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), getChildren(), getPet());
    }

    public void addChild(Human child) {
        int len = getChildren().size();
        Human[] newChildArr = new Human[len + 1];
        for (int i = 0; i <= len; i++) {
            if (i == len) {
                newChildArr[i] = child;
                break;
            }
            newChildArr[i] = getChildren().get(i);
        }
        setChildren(List.of(newChildArr));
    }

    public void deleteChild(int index) {
        int len = getChildren().size();
        Human[] children = new Human[len - 1];
        if (len == 0) {
            System.out.println("No children");
        } else {
            for (int i = 0, ch = 0; i < len; i++) {
                if (index == i) {
                    continue;
                }
                children[ch++] = getChildren().get(i);
            }
            setChildren(List.of(children));
        }

    }

    public int countFamily() {
        int len = 0;
        for (int i = 0; i < children.size(); i++) {
            if (!(children.get(i) == null)) {
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
                father.getName() + " " + father.getSurName() + " children= " + children + " }";
    }
}