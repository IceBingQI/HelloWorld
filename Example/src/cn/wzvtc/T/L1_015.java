package cn.wzvtc.T;

import java.util.Scanner;

public class L1_015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        String c = scanner.next();
        for(int i = 0;i < Math.round(s / 2);i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
}
