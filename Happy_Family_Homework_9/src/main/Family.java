package main;

import abstractClasses.Pet;

import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pet = new HashSet<>();
        father.setFamily(this);
        mother.setFamily(this);

    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }


    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Set<Pet> getPet() {
        return  pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", pet=" + pet +
                ", children=" + children +
                '}';
    }

    public void addChild(Human child) {
        if (child != null) {
            children.add(child) ;
            setChildren(children);
            child.setFamily(this);
        }

    }




    public void deleteChild(Human child) {
        if (child != null) {
            children.remove(child);
            setChildren(children);
            child.setFamily(this);
        }
    }
    public int countFamily(){
        return (2 + getChildren().size());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Remove family");
    }


}