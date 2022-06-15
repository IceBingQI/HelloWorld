package cn.wzvtc.chapter16;

public class Car_Test {
    public static void main(String[] args) {
        SubCar car = new SubCar(1000000 ,88 ,"BYD");
        car.drive();
        car.speedChange(60);
        car.drive();
    }
}
