package dao;

import main.Family;
import main.Human;

import java.util.List;

public class FamilyController {
    private  FamilyService service;

    public FamilyController(FamilyService service) {
        this.service = service;
    }

    public FamilyController() {

    }
    public List<Family> getAllFamilies() {
        return this.service.getAllFamilies();
    }

    public void createNewFamily(Human mother, Human father) {
        this.service.createNewFamily(mother, father);
    }

    public void displayAllFamilies() {
        this.service.displayAllFamilies();
    }
    public Family adoptChild(Human child,Family family) {
        return this.service.adoptChild(child, family);
    }

    public int count() {
        return this.service.count();
    }
}
