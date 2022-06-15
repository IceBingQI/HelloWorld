package cn.wzvtc.chapter16;

public class Shape_Test {
    public static void main(String[] args) {
        Globe globe = new Globe(4);
        globe.cubage();
        Cylinder cylinder = new Cylinder(2,3);
        cylinder.cubage();
        Cone cone = new Cone(2,3);
        cone.cubage();
    }
}

