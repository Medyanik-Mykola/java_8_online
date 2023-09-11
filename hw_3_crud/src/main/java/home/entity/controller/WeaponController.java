package home.entity.controller;

import home.entity.Weapon;
import home.entity.service.WeaponService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class WeaponController {

    private WeaponService weaponService = new WeaponService();

    public void start() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        menu();
        String position = "";
        while ((position = bufferedReader.readLine()) != null) {
            crud(position, bufferedReader);
            menu();
        }
    }

    private void menu() {
        System.out.println("1. Create Weapon");
        System.out.println("2. View Weapons");
        System.out.println("3. Update Weapon");
        System.out.println("4. Delete Weapon");
        System.out.println("0. Exit");
        System.out.println(" ");
        System.out.print("Select an option: ");

    }

    public void crud(String position, BufferedReader bufferedReader) throws IOException {
        switch (position) {
            case "1" -> create(bufferedReader);
            case "2" -> findAll();
            case "3" -> update(bufferedReader);
            case "0" -> System.exit(0);
            case "4" -> delete(bufferedReader);
        }
    }

    private void create(BufferedReader reader) throws IOException {
        System.out.println("Please enter name of Weapon: ");
        String name = reader.readLine();
        System.out.println("Please enter damage: ");
        int damage = Integer.parseInt(reader.readLine());
        System.out.println("Please enter ammo: ");
        int ammo = Integer.parseInt(reader.readLine());
        System.out.println("Please enter ID for this weapon: ");
        String id = reader.readLine();
        weaponService.create(name, damage, ammo, id);
    }

    private void findAll() {
        ArrayList<Weapon> weapons = weaponService.findAll();
        for (Weapon item : weapons) {
            System.out.println(" ");
            System.out.println("Weapon name = " + item.getName() + ", id: " + item.getId());
            System.out.println("Damage = " + item.getDamage());
            System.out.println("Ammo = " + item.getAmmo());
            System.out.println(" ");
        }

    }

    private void delete(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Weapon which u want to delete: ");
        String id = reader.readLine();
        weaponService.delete(id);
        System.out.println("Objects were deleted.");
        System.out.println(" ");
    }

    private void update(BufferedReader reader) throws IOException {
        System.out.println("Please enter ID of Weapon to update: ");
        String id = reader.readLine();
        System.out.println("Please enter updated name: ");
        String name = reader.readLine();
        System.out.println("Please enter updated damage: ");
        int damage = Integer.parseInt(reader.readLine());
        System.out.println("Please enter updated ammo: ");
        int ammo = Integer.parseInt(reader.readLine());

        weaponService.update(id, name, damage, ammo);
        System.out.println("Weapon updated successfully.");
    }

}
