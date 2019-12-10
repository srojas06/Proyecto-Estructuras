package Lógica;

public class Dessert extends Menu {

    private String postre;

    public Dessert(String postre, int cost, String code) {
        super(cost, code);
        this.postre = postre;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

}
