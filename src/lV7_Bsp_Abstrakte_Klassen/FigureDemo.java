package lV7_Bsp_Abstrakte_Klassen;

public class FigureDemo {

    public static void main(String[] args) {


        FigureManager fm = new FigureManager();

        fm.add(new Circle(15));
        fm.add(new Circle(27.5));
        fm.add(new Rectangle(27.5,300));

        System.out.println("Umfang:" +fm.getMaxPerimeter());
        System.out.println(          fm.getAreaBySizeCategories());
        System.out.println(fm.avgArea());


    }
}
