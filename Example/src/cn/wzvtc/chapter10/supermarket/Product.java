package cn.wzvtc.chapter10.supermarket;

public class Product {
    private static String name;
    private double prise;

    public static String getName() {
        return name;
    }

    public double getPrise() {
        return prise;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setPrise(double prise1) {
        prise = prise1;
    }
}
