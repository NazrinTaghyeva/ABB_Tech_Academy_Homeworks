package dao;

import dao.FamilyDao;
import main.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> collectionFamilyDao = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return this.collectionFamilyDao;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (collectionFamilyDao.get(index) != null) {
            return collectionFamilyDao.get(index);
        } else {
            return null;
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if (collectionFamilyDao.remove(index) != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        if (collectionFamilyDao.remove(family)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Family saveFamily(Family family) {
        return family;
    }
}
