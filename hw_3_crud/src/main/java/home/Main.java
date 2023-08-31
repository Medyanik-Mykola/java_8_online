package home;

import home.entity.Weapon;
import home.entity.controller.WeaponController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        WeaponController weaponController = new WeaponController();
        weaponController.start();


    }
}