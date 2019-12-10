package Lógica;

public class Menu {

    private int cost;
    private String code;
    private Food food;
    private Drink drink;
    private Dessert dessert;

    public Menu() {
    }

    public Menu(int cost, String code) {
        this.cost = cost;
        this.code = code;
    }

    public Menu(int cost, Drink drink) {
        this.cost = cost;
        this.drink = drink;
    }

    public Menu(int cost, Food food, Drink drink, Dessert dessert) {
        this.cost = cost;
        this.food = food;
        this.drink = drink;
        this.dessert = dessert;
    }

    public int getCost() {
        return cost;
    }

    public int setCost(int cost) {
        this.cost = cost;
        return cost;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Food getFood (){
        return this.food;
    }

}
