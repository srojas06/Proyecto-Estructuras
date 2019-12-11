package proyecto_estructuras_final.logica;

import javax.swing.JOptionPane;

public class Admin {

    private Menu orden;
    private Food food;
    private Drink drink;
    private Dessert dessert;
    Food listFood[];//Lista de platillos
    Drink listDrink[];//Lista de Refrescos
    Dessert listDessert[];//Lista de Postres

    public Admin() {
        this.listFood = new Food[5];
        this.listDrink = new Drink[5];
        this.listDessert = new Dessert[5];
    }

    public void FoodMenu() {

        listFood[0] = new Food("Tacos", 2500, "FD-1001");
        listFood[1] = new Food("Pozole", 4500, "FD-1002");
        listFood[2] = new Food("Enfrijolada", 4500, "FD-1003");
        listFood[3] = new Food("Quesadillas Mexicanas", 2500, "FD-1004");
        listFood[4] = new Food("Ceviche Mexicano", 3450, "FD-1005");

        System.out.println(".:Menu de Comidas:.");
        for (int i = 0; i < listFood.length; i++) {
            this.food = this.listFood[i];
            System.out.println("Plato: " + this.food.getPlatillo()+ ", Precio: " + this.food.getCost() + ", Codigo: " + this.food.getCode());
        }
        System.out.println("***************************************");
    }

    public void DrinkMenu() {

        listDrink[0] = new Drink("Tequila", 2800, "DR-2001");
        listDrink[1] = new Drink("Pozol", 3000, "DR-2002");
        listDrink[2] = new Drink("Pulque", 2500, "DR-2003");
        listDrink[3] = new Drink("Mezcal", 2900, "DR-2004");
        listDrink[4] = new Drink("Tejuino", 2000, "DR-2005");

        System.out.println(".:Menu de Refrescos:.");
        for (int i = 0; i < listDrink.length; i++) {
            this.drink = this.listDrink[i];
            System.out.println("Refresco: " + drink.getSabor() + ", Precio: " + drink.getCost() + ", Codigo: " + drink.getCode());
        }
        System.out.println("***************************************");
    }

    public void DessertMenu() {

        listDessert[0] = new Dessert("Jericallas", 2000, "DT-3001");
        listDessert[1] = new Dessert("Churros", 4500, "DT-3002");
        listDessert[2] = new Dessert("Buñuelos", 2000, "DT-3003");
        listDessert[3] = new Dessert("Capirotada", 4500, "DT-3004");
        listDessert[4] = new Dessert("Arroz con leche", 2000, "DT-3005");
        listDessert[5] = new Dessert("Arroz con leche", 2000, "DT-3005");

        System.out.println(".:Menu de Postres:.");
        for (int i = 0; i < listDessert.length; i++) {
            this.dessert = this.listDessert[i];
            System.out.println("Postre: " + dessert.getPostre() + ", Precio: " + dessert.getCost() + ", Codigo: " + dessert.getCode());
        }
        System.out.println("***************************************");
    }
}
