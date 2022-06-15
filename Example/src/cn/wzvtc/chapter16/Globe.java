package cn.wzvtc.chapter16;

class Globe extends Shape {
    public Globe(double radius) {
        super.radius = radius;
    }

    public void cubage() {
        System.out.printf("%.2f\n", 4.0 / 3.0 * Math.PI * radius * radius * radius);
    }
}
