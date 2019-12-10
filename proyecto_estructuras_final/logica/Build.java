package Lógica;

import javax.swing.JOptionPane;

public class Build {

    private int menu;
    Admin admin = new Admin();

    public void doProcess() {

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(".:Restaurante Mexicano:.\n"
                    + "1. Menu Comida\n"
                    + "2. Menu Refrescos\n"
                    + "3. Menu Postres\n"
                    + "0. Salir\n"
                    + "Digite cual menu desea acceder:"));

            switch (menu) {

                case 1://Menu de comida
                    admin.FoodMenu();
                    break;

                case 2://Menu de refrescos
                    admin.DrinkMenu();
                    break;
                case 3://Menu de postres
                    admin.DessertMenu();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                default:
                    System.out.println("Error digite una opcion");
            }

        } while (menu != 0);
    }
}
