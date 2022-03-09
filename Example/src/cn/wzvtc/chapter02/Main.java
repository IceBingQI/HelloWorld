package cn.wzvtc.chapter02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        int C;
        C = 5 * ( F - 32 ) / 9;
        System.out.println("Celsius = "+C);
    }
}
