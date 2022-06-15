package cn.wzvtc.chapter16;

public class Example03 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100;i<=999;i++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (a*a*a+b*b*b+c*c*c == i){
                System.out.println(i);
                count += i;
            }
        }
        System.out.println("和："+count);
    }
}
