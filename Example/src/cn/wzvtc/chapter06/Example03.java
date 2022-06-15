package cn.wzvtc.chapter06;

public class Example03 {
    public static void main(String[] args) {
        int result=a(10);
        System.out.println(result);
    }
    public static int a(int n){
        int i=0,result=0;
        for (int j=0;j<=n;j++){
            i=j*i;
            result+=i;
        }
        return result;
    }
}
