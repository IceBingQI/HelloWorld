package cn.wzvtc.chapter10.xt;

public class Yard_output {
    public static void main(String[] args) {
        Yard y = new Yard();
        y.setLength(20);
        y.setWidth(10);
        System.out.println("周长="+y.getPerimeter());
        System.out.println("面积="+y.getAcreage());
    }
}
