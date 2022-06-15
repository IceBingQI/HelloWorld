package cn.wzvtc.T;

import java.util.Scanner;

public class T7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n % 16;
        int b = n / 16;
        System.out.print(b * 10 + a);
    }
}
