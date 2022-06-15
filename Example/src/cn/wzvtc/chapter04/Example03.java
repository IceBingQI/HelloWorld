package cn.wzvtc.chapter04;

public class Example03 {
    public static void main(String[] args) {
        int n = 1,p = 1;
        while(n < 10){
            p = ( p + 1 ) * 2;
            n = n + 1;
        }
        System.out.println("第一天共摘了"+p+"个桃子");
    }
}
