package home.entity.service;

import home.entity.Weapon;
import home.entity.db.WeaponDB;

import java.util.ArrayList;

public class WeaponService {

    private WeaponDB weaponDB = new WeaponDB();

    public void create(String name,  int damage, int ammo, String id) {
        Weapon weapon = new Weapon();
        weapon.setName(name);
        weapon.setDamage(damage);
        weapon.setAmmo(ammo);
        weapon.setId(id);
        weaponDB.create(weapon);
    }

    public ArrayList<Weapon> findAll() {
        return weaponDB.findAll();
    }
    public void delete(String id) {
        ArrayList<Weapon> weapons = weaponDB.findAll();
        Weapon foundWeapon = null;

        for (Weapon weapon : weapons) {
            if (weapon.getId().equals(id)) {
                foundWeapon = weapon;
                break;
            }
        }

        if (foundWeapon != null) {
            weaponDB.delete(foundWeapon);
        } else {
            System.out.println("Weapon with ID " + id + " not found.");
        }
    }

    public void update(String id, String name, int damage, int ammo) {
        ArrayList<Weapon> weapons = weaponDB.findAll();
        for (Weapon weapon : weapons) {
            if (weapon.getId().equals(id)) {
                weapon.setName(name);
                weapon.setDamage(damage);
                weapon.setAmmo(ammo);
                return;
            }
        }
        System.out.println("Weapon with ID " + id + " not found.");
    }


}

