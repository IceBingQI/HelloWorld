package cn.wzvtc.chapter07;

public class example02 {
    public static void main(String[] args) {
        int[] a = {1000,2533,3456,4862,5204,6253,7111,8221,3253,5631};
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for (int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }
}
