package cn.wzvtc.T;

import java.util.Scanner;

public class T7_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        int B = scanner.nextInt();
        String C = scanner.next();
        double D = scanner.nextDouble();
        System.out.println(C+" "+B+" "+String.format("%.2f",A)+" "+String.format("%.2f",D));
    }
}
