package LV3;

public class Zutat {

    private String zutatName;
    private int quantity;

    public Zutat(String name, int quantity) {
        this.zutatName = name;
        this.quantity = quantity;
    }

    public String getZutatName() {
        return zutatName;
    }

    public int getQuantity() {
        return quantity;
    }

   // @Override
    public String toString() {
        return "Zutat{" +
                "Zutatname='" + zutatName + '\'' +
                ", Menge=" + quantity +
                '}';
    }
}
