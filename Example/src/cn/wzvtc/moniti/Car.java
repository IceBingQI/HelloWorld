package cn.wzvtc.moniti;

public class Car extends Vehicle{
    private int loader;

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println("此车有"+getWheels()+"个轮子，重量为"+getWeight()+"KG，车上载有"+this.getLoader()+"个人");
    }
}
