package LV3;

public class Bestellzeile {

    private String articleName;
    private int articleQuantity;
    private int articlePrice;

    public Bestellzeile(String articleName, int articleQuantity, int articlePrice) {
        this.articleName = articleName;
        this.articleQuantity = articleQuantity;
        this.articlePrice = articlePrice;
    }

    public String getArticleName() {
        return articleName;
    }

    public int getArticleQuantity() {
        return articleQuantity;
    }

    public int getArticlePrice() {
        return articlePrice;
    }
    public double getKosten(){
        return this.articleQuantity*this.articlePrice;
    }

    @Override
    public String toString() {
        return "Bestellzeile{" +
                "Artikelname= '" + articleName + '\'' +
                ", Menge= " + articleQuantity +
                ", Preis= " + articlePrice +
                '}';
    }
}
