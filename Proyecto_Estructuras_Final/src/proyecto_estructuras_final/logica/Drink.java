package proyecto_estructuras_final.logica;

public class Drink extends Menu {

    private String sabor;//Atributo

    //Constructor para crear el objeto Drink
    public Drink(String sabor, int cost, String code) {
        super(cost, code);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
