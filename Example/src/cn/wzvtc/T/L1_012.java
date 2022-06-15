package cn.wzvtc.T;

import java.util.Scanner;

public class L1_012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 2;
        for (int i = 1;i < n;i++){
            c *= 2;
        }
        System.out.println("2^"+n+" = "+c);
    }
}
