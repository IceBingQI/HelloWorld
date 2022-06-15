package cn.wzvtc.chapter08;

import java.util.Scanner;

public class example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[10];
        for (int j=0;j<10;j++){
            int n = scanner.nextInt();
            x[n]++;
        }
        for (int i = 0;i < x.length;i++){
            if (x[i]==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
