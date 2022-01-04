package lV7_Vererbung_Bsp_Land;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    private ArrayList<Land> laender =
            new ArrayList<>();

    public void add(Land l)
    {
        laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
        double sum = 0;

        for (Land l: laender ) {
            sum = sum + l.getBruttoSozialProdukt();
        }

        return sum;
    }

}
