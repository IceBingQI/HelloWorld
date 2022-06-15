package cn.wzvtc.chapter10.supermarket;

public class Custom {
    public Product shopping(Market market, String productName){
        return market.sell(productName);
    }
}
