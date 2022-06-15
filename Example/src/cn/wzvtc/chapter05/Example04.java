package cn.wzvtc.chapter05;

public class Example04 {
    public static void main(String[] args) {
        int s=1;
        for (int i=1;i<=10;i++){
            int n=1;
            for (int j=1;j<=i;j++){
                n*=j;
            }
            s+=n;
        }
        System.out.println(s);
    }
}
