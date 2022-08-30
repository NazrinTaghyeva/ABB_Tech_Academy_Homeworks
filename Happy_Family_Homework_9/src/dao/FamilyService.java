package dao;

import main.Family;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }
    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }
    
}
