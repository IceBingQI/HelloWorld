package cn.wzvtc.chapter10.supermarket;

public class output {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("电视机");
        Product p2 = new Product();
        p2.setName("收音机");
        Product p3 = new Product();
        p3.setName("洗衣机");
        Product p4 = new Product();
        p4.setName("吹风机");
        Product p5 = new Product();
        p5.setName("手机");

        Market market = new Market();
        market.setName("家乐福");
        market.setProductList(new Product[]{p1, p2, p3, p4, p5});

        Custom custom = new Custom();
        custom.shopping(market,"电视机");
        System.out.println(Product.getName());
    }
}
