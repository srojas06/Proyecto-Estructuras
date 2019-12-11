/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_estructuras_final.logica;
public class Control {

    Food listFood[];
    Drink listDrink[];
    Dessert listDessert[];

    public Control() {
        this.listFood = new Food[5];
        this.listDrink = new Drink[5];
        this.listDessert = new Dessert[5];

    }

    public Food[] getListFood() {
        return listFood;
    }

    public void setListFood(Food[] listFood) {
        this.listFood = listFood;
    }

    public Drink[] getListDrink() {
        return listDrink;
    }

    public void setListDrink(Drink[] listDrink) {
        this.listDrink = listDrink;
    }

    public Dessert[] getListDessert() {
        return listDessert;
    }

    public void setListDessert(Dessert[] listDessert) {
        this.listDessert = listDessert;
    }
    
    public void llenarListas (){
        //Llenar lista de comida
        listFood[0] = new Food("Tacos", 2500, "FD-1001");
        listFood[1] = new Food("Pozole", 4500, "FD-1002");
        listFood[2] = new Food("Enfrijolada", 4500, "FD-1003");
        listFood[3] = new Food("Quesadillas Mexicanas", 2500, "FD-1004");
        listFood[4] = new Food("Ceviche Mexicano", 3450, "FD-1005");
        
        //Llenar lista de bebidas
        listDrink[0] = new Drink("Tequila", 2800, "DR-2001");
        listDrink[1] = new Drink("Pozol", 3000, "DR-2002");
        listDrink[2] = new Drink("Pulque", 2500, "DR-2003");
        listDrink[3] = new Drink("Mezcal", 2900, "DR-2004");
        listDrink[4] = new Drink("Tejuino", 2000, "DR-2005");

        //Llenar lista de postres
        listDessert[0] = new Dessert("Jericallas", 2000, "DT-3001");
        listDessert[1] = new Dessert("Churros", 4500, "DT-3002");
        listDessert[2] = new Dessert("Buñuelos", 2000, "DT-3003");
        listDessert[3] = new Dessert("Capirotada", 4500, "DT-3004");
        listDessert[4] = new Dessert("Arroz con leche", 2000, "DT-3005");
        
        System.out.println("Listas llenas");
    }

    public void mostrarArticulos() {
        for (Food listFood1 : this.listFood) {
            System.out.println(listFood1.getPlatillo());
        }
        System.out.println("");
        for (Drink listDrink1 : this.listDrink) {
            System.out.println(listDrink1.getSabor());
        }
        System.out.println("");
        for (Dessert listDessert1 : this.listDessert) {
            System.out.println(listDessert1.getPostre());
        }
    }

    public String[] obtenerNombres(int tipo) {
        String nombreArticulos[] = new String[5];
        switch (tipo) {
            case 1:
                for (int i = 0; i < this.listFood.length; i++) {
                    nombreArticulos[i] = this.listFood[i].getPlatillo()+"     Precio:"+this.listFood[i].getCost();
                }
                break;
            case 2:
                for (int i = 0; i < this.listDrink.length; i++) {
                    nombreArticulos[i] = this.listDrink[i].getSabor()+"     Precio:"+this.listDrink[i].getCost();
                }
                break;
            case 3:
                for (int i = 0; i < this.listDessert.length; i++) {
                    nombreArticulos[i] = this.listDessert[i].getPostre()+"     Precio:"+this.listDessert[i].getCost();
                }
        }
        return nombreArticulos;
    }
}
