package cn.wzvtc.chapter04;

public class Example02 {
    public static void main(String[] args) {
        int x =100,count = 0;
        while (x <= 999){
            int a = x / 100;
            int b = x / 10 % 10;
            int c = x % 10;
            if (a*a*a+b*b*b+c*c*c == x){
                System.out.println(x);
                count += x;
            }
            x++;
        }
        System.out.println("和："+count);
    }
}
