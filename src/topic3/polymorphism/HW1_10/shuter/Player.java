package topic3.polymorphism.HW1_10.shuter;
import topic3.polymorphism.HW1_10.shuter.weapon.*;

public class Player {
    protected Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{new Pistol(), new Automatic(), new Rpg(), new Slingshot(), new WaterPistol()};
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot < 0 || slot >= weaponSlots.length) {
            throw new IllegalArgumentException("Такого слота нет, нужно ввести число от 0 до 4 или -1 для выхода \n");
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}