package cn.wzvtc.chapter06;

public class Example02 {
    public static void main(String[] args) {
        double result=getArea(5);
        System.out.println(result);
    }
    public  static double getArea(double r){
        double result=r*r*Math.PI;
        return result;
    }
}
