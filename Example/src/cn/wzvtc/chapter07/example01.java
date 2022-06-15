package cn.wzvtc.chapter07;

public class example01 {
    public static void main(String[] args) {
        int[] a = {1000,2533,3456,4862,5204,6253,7111,8221,3253,5631};
        int b =a[0];
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            b+=a[i];
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("平均工资："+b/a.length);
        System.out.println("最大工资："+max);
        System.out.println("最小工资："+min);
    }
}

