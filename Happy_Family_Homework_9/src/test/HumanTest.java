package test;

import enums.DaysOfWeekEnum;
import main.Human;
import org.testng.annotations.Test;

import java.util.Locale;

import static org.testng.Assert.assertNotEquals;

public class HumanTest {
    Human child = new Human("Selena","Gomez",2002,85);
    Human child2 =new Human("Rosy","Gomez",2005,47);

    @Test
    public void checkHuman(){
        Human child = new Human("Selena","Gomez",2002,85);
        Human child2 =new Human("Rosy","Gomez",2005,47);
        assertNotEquals(child,child2);
    }
}