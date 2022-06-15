package cn.wzvtc.moniti;

public class Example06 {
    public static void main(String[] args) {
        Vehicle a = new Vehicle(6,3500);
        Car b = new Car(4,2500,5);
        Truck c =new Truck(6,3500,2,20000);
        a.run();
        b.run();
        c.run();
    }
}
