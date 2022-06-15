package cn.wzvtc.moniti;

public class Truck extends Car{
    private double payload;

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    @Override
    public void run() {
        System.out.println("此车有"+getWheels()+"个轮子，重量为"+getWeight()+"KG，车上载有"+getLoader()+"个人，能装载"+this.getPayload()+"KG的货物");
    }
}
