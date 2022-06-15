package cn.wzvtc.chapter13.xt;

public class ShapeDemo {
    public static void main(String[] args) {
        Globe globe = new Globe(2);
        globe.cubage();
        Cylinder cylinder = new Cylinder(2,3);
        cylinder.cubage();
        Cone cone = new Cone(2,3);
        cone.cubage();
    }
}

abstract class Shape {
    public double radius;
    public abstract void cubage();
}
class Globe extends Shape{
    public Globe(double radius){
        super.radius=radius;
    }
    public void cubage(){
        System.out.printf("%.2f\n", 4.0 / 3.0 * Math.PI * radius * radius * radius);
    }
}
class Cylinder extends Shape{
    public double height;
    public Cylinder(double radius,double height){
        super.radius=radius;
        this.height=height;
    }
    public void cubage(){
        System.out.printf("%.2f\n", Math.PI * radius * radius * height);
    }
}
class Cone extends Shape{
    public double height;
    public Cone(double radius,double height){
        super.radius=radius;
        this.height=height;
    }
    public void cubage(){
        System.out.printf("%.2f\n", 1.0 / 3.0 * Math.PI * radius * radius * height);
    }
}
