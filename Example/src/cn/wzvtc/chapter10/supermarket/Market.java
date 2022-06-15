package cn.wzvtc.chapter10.supermarket;

public class Market {
    private String name;
    private Product[] productList;

    public String getName() {
        return name;
    }

    public void setName(String name1) {
        name = name;
    }

    public Product[] getProductList() {
        return productList;
    }

    public void setProductList(Product[] productList1) {
        productList = productList1;
    }

    public Product sell(String productName){
        for (int i = 0;i< productList.length;i++){
            if (productList[i].getName() == productName){
                return productList[i];
            }
        }
        return null;
    }
}
