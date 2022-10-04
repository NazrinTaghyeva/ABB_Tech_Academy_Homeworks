package org.example;


public class Men extends Human1 {
    public Men(String fName, String fSurname, String fBirthDate, int fIq) {
        super(fName,fSurname,fBirthDate,fIq);
    }
    public Men() {

    }

    @Override
    void greetPet() {
        System.out.println("You are cute");
    }
    void repairCar(){
        System.out.println("I can repair car");
    }
}