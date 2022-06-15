package cn.wzvtc.chapter12.xt;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isRightTriangle(){
        if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a){
            return true;
        }else {
            return false;
        }
    }

    public boolean isIsoscelesTriangle(){
        if (a==b || a==c || b==c){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEquilateralTriangle(){
        if (a==b && b==c){
            return true;
        }else {
            return false;
        }
    }

    public double getArea(){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    public double getLength(){
        return a+b+c;
    }
}
