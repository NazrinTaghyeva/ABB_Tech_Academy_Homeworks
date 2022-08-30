package manVsWoman;

import main.Human;

public class Woman extends Human {
    public void greetPet(){
        System.out.println("Hi...");
    }
    public void makeUp(){
        System.out.println("MakeUp....");
    }
    public Woman(String name, String surname, int year, int iq, String[][] schedule){
        super(name,surname,year,iq,schedule);
    }
}
