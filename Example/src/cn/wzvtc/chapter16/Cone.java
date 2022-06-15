package cn.wzvtc.chapter16;

class Cone extends Shape {
    public double height;

    public Cone(double radius, double height) {
        super.radius = radius;
        this.height = height;
    }

    public void cubage() {
        System.out.printf("%.2f\n", 1.0 / 3.0 * Math.PI * radius * radius * height);
    }
}
