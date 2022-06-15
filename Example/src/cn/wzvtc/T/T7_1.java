package cn.wzvtc.T;

import java.util.Scanner;

public class T7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cm = scanner.nextInt();
        int a;
        int b;
        a = (int) (cm / 30.48);
        b = (int) ((cm % 30.48)/30.48*12);
        System.out.println(a+" "+b);
    }
}
