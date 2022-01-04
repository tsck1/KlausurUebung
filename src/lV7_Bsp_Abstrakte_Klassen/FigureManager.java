package lV7_Bsp_Abstrakte_Klassen;

import lv4.Wasserstand;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {

    private ArrayList<Figure> figures = new ArrayList<Figure>();

    public void add(Figure f) {
        figures.add(f);
    }

    public double getMaxPerimeter() {
        double maxPerimeter = 0;
        for (Figure figure : figures) {
            double p = figure.getPerimeter();
            if (p > maxPerimeter)
                maxPerimeter = p;
        }
        return maxPerimeter;

    }

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> result = new HashMap<>();
        result.put("klein", 0.0);
        result.put("mittel", 0.0);
        result.put("groß", 0.0);

        for (Figure figure : figures) {
            if (figure.getArea() < 1000) {
                double current = result.get("klein");
                current += figure.getArea();
                result.put("klein", current);
            } else if (figure.getArea() < 5000) {
                double current = result.get("mittel");
                current += figure.getArea();
                result.put("mittel", current);
            } else {
                double current = result.get("groß");
                current += figure.getArea();
                result.put("groß", current);
            }
        }
        return result;
    }
    public double avgArea(){
        double avgArea=0.0;
        int count=0;
        for (Figure w: figures){
            avgArea +=w.getArea();
            count++;
            }

        if (count>0){
            return Math.round(avgArea/count*100)/100D;
        }
        return 0.0;
    }
}
