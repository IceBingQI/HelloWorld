package cn.wzvtc.chapter07;

import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[101];
        while (true){
            int n = scanner.nextInt();
            if (n==0) {
                break;
            }
            a[n]++;
            }
        for (int i = 0;i < a.length;i++){
            if (a[i]==0){
                continue;
            }
            System.out.printf("%d出现%d次\n", i,a[i]);
        }
    }
}

