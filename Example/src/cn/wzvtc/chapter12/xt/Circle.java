package cn.wzvtc.chapter12.xt;

public class Circle extends Shape{
    private double r;

    public Circle(){

    }
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void getArea(){
        System.out.printf("%.2f\n",Math.PI*r*r);
    }
}
