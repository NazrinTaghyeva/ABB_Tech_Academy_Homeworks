package main;

import abstractClasses.Pet;
import enums.DaysOfWeekEnum;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int dateOfBirthyear;
    private int iq;
    private Map<String,String> schedule ;

    private Family family;

    public Human() {
    }

    public Human(
            String name,
            String surname,
            int dateOfBirthyear
    ){
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;

    }
    public Human(
            String name,
            String surname,
            int dateOfBirthyear,
            int iq,
            Map<String,String> schedule,
            Family family
    ) {
        this.name = name;
        this.surname=surname;
        this.dateOfBirthyear=dateOfBirthyear;
        this.iq=iq;
        this.schedule=schedule;
        this.family=family;
    }
    public void setName(String name) { this.name = name;    }
    public void setSurname(String surname) { this.surname = surname;    }
    public void setDateOfBirthyear(int dateOfBirthyear) { this.dateOfBirthyear = dateOfBirthyear;    }
    public void setIq(int iq) { this.iq = iq;    }
    public void setSchedule(Map<String, String> schedule){ this.schedule=schedule;}
    public void setFamily(Family family) { this.family = family;    }

    public String getName() { return name;    }
    public String getSurname() { return surname;    }
    public int getDateOfBirthyear(){ return dateOfBirthyear;}
    public int getIq(){ return iq;}
    public  Map<String,String> getSchedule(){ return schedule;}
    public Family getFamily(){ return family;   }


    void greetPet(){
        System.out.println("Hello");
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human1 = (Human) o;
        return dateOfBirthyear == human1.dateOfBirthyear && iq == human1.iq && name.equals(human1.name) && surname.equals(human1.surname) && family.equals(human1.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirthyear, iq, family);
    }

    @Override
    public String toString() {
        if (iq == 0 && schedule == null) {
            return  "{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + dateOfBirthyear +
                    '}';
        } else if (schedule == null) {
            return  "{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", year=" + dateOfBirthyear +
                    ", iq=" + iq +
                    '}';
        }
        return   "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirthyear +
                ", iq=" + iq +
                ", schedule=" + schedule +
                '}';
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Remove human");
    }
}