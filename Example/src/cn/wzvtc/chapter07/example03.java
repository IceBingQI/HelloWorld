package cn.wzvtc.chapter07;

import java.util.Scanner;

public class example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int n = 0;n<a.length;n++){
            a[n]= scanner.nextInt();
        }
        for (int i = 0;i < a.length;i++){
            for (int j = 0;j < a.length-i-1;j++){
                if (a[j] < a[j+1]){
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
