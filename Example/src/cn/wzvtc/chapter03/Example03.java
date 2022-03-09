package cn.wzvtc.chapter03;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + "是偶数");
        } else {
            System.out.println(x + "是奇数");
        }
    }
}
