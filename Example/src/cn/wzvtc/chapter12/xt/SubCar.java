package cn.wzvtc.chapter12.xt;

public class SubCar extends Car{
    private int price;
    private int speed;

    public void speedChange(int newSpeed){
        speed = newSpeed;
    }

    public SubCar(int price, int speed, String mark) {
        this.price = price;
        this.speed = speed;
        setMark(mark);
    }

    public void drive(){
        System.out.println("驾驶品牌为"+getMark()+"的汽车，速度为"+speed+"，价格为"+price+"元");
    }
}
