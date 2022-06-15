package cn.wzvtc.chapter16;

class Cylinder extends Shape {
    public double height;

    public Cylinder(double radius, double height) {
        super.radius = radius;
        this.height = height;
    }

    public void cubage() {
        System.out.printf("%.2f\n", Math.PI * radius * radius * height);
    }
}
