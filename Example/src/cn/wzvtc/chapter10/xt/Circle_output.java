package cn.wzvtc.chapter10.xt;

public class Circle_output {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setR(5);
        System.out.println("圆的半径是"+c.getR());
        System.out.printf("圆的面积是%.2f\n",c.findArea());
        System.out.printf("圆的周长是%.2f",c.periMeter());
    }
}
