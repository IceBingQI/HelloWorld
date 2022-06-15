package cn.wzvtc.chapter05;

public class Example03 {
    public static void main(String[] args) {
        long n = 1;
        long a = 1;
        double w;
        for (int i = 2;i <= 32;i++){
            n *= 2;
            a += n;
        }
        w=a*0.00001;
        System.out.println(w+"Kg");
    }
}
