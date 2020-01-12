package topic3.polymorphism.HW1_10.shuter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        String[] guns = new String[]{"Пистолет", "Автомат", "РПГ", "Рогатка", "Водный пистолет"};
        Player player = new Player();
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < guns.length; i++) {
            System.out.printf("%d. %s\t\n", i, guns[i]);
        }
        System.out.println();

        System.out.format("У игрока %d слотов с оружием,"
                + " введите номер, чтобы выстрелить или"
                + " -1 чтобы выйти %n", player.getSlotsCount());

        int slot;
        while (true) {
            System.out.println("Для выстрела оружия из списка введите число 0-4:");
            try {
                slot = text.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы вели строку " + e + ", а нужно ввести число 0-4");
                System.out.println("Не сдавайся, попробуй еще раз ");
                break;
            }
            if (slot == -1) {
                break;
            }
            try {
                player.shotWithWeapon(slot);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Game over!");
    }
}


