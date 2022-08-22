package manVsWoman;

import main.Family;
import main.Human;

public class Man extends Human {
   public void greetPet(){
       System.out.println("Hello....");
   }
   public void repairCar(){
       System.out.println("Chevrolet....");
   }
    public Man(String name, String surname, int year, int iq, Family family){
        super(name,surname,year,iq,family);
    }

}
