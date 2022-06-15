package cn.wzvtc.chapter04;

public class Example03_1 {
    public static void main(String[] args) {
        int p = 1,n = 1;
        do {
            p = ( p + 1 ) * 2;
            n = n + 1;
        }while (n <= 9);
        System.out.println("第一天共摘了"+p+"个桃子");
    }
}
