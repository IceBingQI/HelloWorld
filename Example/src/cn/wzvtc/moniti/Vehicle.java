package cn.wzvtc.moniti;

public class Vehicle {
    private int wheels;
    private double weight;

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void run(){
        System.out.println("此车有"+getWheels()+"个轮子，重量为"+getWeight()+"KG");
    }
}
