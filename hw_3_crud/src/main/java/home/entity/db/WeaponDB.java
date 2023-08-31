package home.entity.db;

import home.entity.Weapon;

import java.util.ArrayList;

public class WeaponDB {
    private ArrayList<Weapon> weapons = new ArrayList();

    public void create(Weapon weapon) {
        weapons.add(weapon);
    }

    public ArrayList<Weapon> findAll() {
        return weapons;
    }

    public void delete(Weapon weapon){
        weapons.remove(weapon);
    }
}


