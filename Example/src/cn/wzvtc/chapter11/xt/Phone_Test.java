package cn.wzvtc.chapter11.xt;

public class Phone_Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.setBrand("小米");
        p.setColor("黑色");
        p.setPrice(3998);
        p.call();
        p.sendMassage();
    }
}
