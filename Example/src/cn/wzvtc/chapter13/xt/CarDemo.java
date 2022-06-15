package cn.wzvtc.chapter13.xt;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("A00001","jeep",200000,"绿色");
        car.show();
        Bus bus = new Bus("A00002","金龙",250000,30);
        bus.show();
    }
}
abstract class Motovercal{
    public String no;
    public String type;
    public double price;
    public abstract void show();
}
class Car extends Motovercal{
    public String color;
    public Car(String no,String type,double price,String color){
        super.no=no;
        super.type=type;
        super.price=price;
        this.color=color;
    }
    public void show(){
        System.out.println("本车车牌号为："+no+",类型为："+type+",价格为："+price+",颜色为："+color);
    }
}
class Bus extends Motovercal{
    public int seatCount;
    public Bus(String no,String type,double price,int seatCount){
        super.no=no;
        super.type=type;
        super.price=price;
        this.seatCount=seatCount;
    }
    public void show(){
        System.out.println("本车车牌号为："+no+",类型为："+type+",价格为："+price+"拥有："+seatCount+"个座位");
    }
}