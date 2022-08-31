package dao;

import main.Family;
import main.Human;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }
    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }
    public void createNewFamily(Human mother, Human father)
    {
        Family family = new Family(mother,father);
        familyDao.saveFamily(family);
    }
    public void displayAllFamilies(){
        this.familyDao.getAllFamilies().forEach(family -> System.out.printf("%d %s \n", getAllFamilies().indexOf(family), family));
    }
    public Family adoptChild(Human child, Family family){
        family.addChild(child);
        return familyDao.saveFamily(family);
    }
    public int count() {
        return familyDao.getAllFamilies().size();
    }

}
