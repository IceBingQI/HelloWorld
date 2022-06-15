package cn.wzvtc.moniti;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int [10];
        double y=0;
        for (int i = 0; i<10;i++){
            n[i]=scanner.nextInt();
        }
        for (int j = 0;j<10;j++){
            y+=n[j];
        }
        System.out.println(y/10);
    }
}
