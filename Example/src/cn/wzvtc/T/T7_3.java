package cn.wzvtc.T;

import java.util.Scanner;

public class T7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,a,b,c;
        n = scanner.nextInt();
        a = n % 10;
        b = n / 10 % 10;
        c = n / 100;
        System.out.println(c+b*10+a*100);
    }
}
