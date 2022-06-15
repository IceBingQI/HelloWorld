package cn.wzvtc.T;

import java.util.Scanner;

public class T7_18_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a3 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double a1 = scanner.nextDouble();
        double a0 = scanner.nextDouble();
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double ab = (a + b) / 2;
        double fa = f(a,a3,a2,a1,a0);
        double fb = f(b,a3,a2,a1,a0);
        double fab = f(ab,a3,a2,a1,a0);
        boolean flag = false;
        while (fa * fb <= 0 && a <= b - 0.001) {
            if (fa == 0) {
                flag = true;
                System.out.printf("%.2f", a);
                break;
            }
            if (fb == 0) {
                flag = true;
                System.out.printf("%.2f", b);
                break;
            }
            if (fab * fa > 0) {
                a = ab;
            }else {
                b = ab;
            }
            fa = f(a,a3,a2,a1,a0);
            fb = f(b,a3,a2,a1,a0);
            fab = f(ab,a3,a2,a1,a0);
        }
        if (!flag){
            System.out.printf("%.2f",ab);
        }
    }
    public static double f(double value,double a3,double a2,double a1,double a0) {
        return a3 * value * value * value + a2 * value * value + a1 * value + a0;
    }
}
