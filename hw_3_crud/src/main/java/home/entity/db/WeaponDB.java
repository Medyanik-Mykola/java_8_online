package home.entity.db;

import home.entity.Weapon;

import java.util.ArrayList;

public class WeaponDB {
    private ArrayList<Weapon> weapons = new ArrayList(); // Створіть клас, який буде зберігати массив ваших сутностей. - це не схоже на масив

    public void create(Weapon weapon) {
        weapons.add(weapon);
    }

    public ArrayList<Weapon> findAll() {
        return weapons;
    }

    public void delete(Weapon weapon){
        weapons.remove(weapon);
    }

    public void update(String id, String name, int damage, int ammo) { // а що цей метод робить???
    }
}
