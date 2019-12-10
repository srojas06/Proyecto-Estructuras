package Lógica;

public class Food extends Menu {

    private String platillo; //Atributo 

    //Constructor para crear un platillo

    public Food() {
    }
 
    public Food(String platillo, int cost, String code) {
        super(cost, code);
        this.platillo = platillo;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }
    
    
}
