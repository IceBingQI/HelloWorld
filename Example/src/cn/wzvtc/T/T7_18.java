package cn.wzvtc.T;

import java.util.Scanner;

public class T7_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] n = new double[4];
        for (int i = 3; i >= 0; i--) {
            n[i] = scanner.nextDouble();
        }
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double ab = (a + b) / 2;
        double fa = f(a,n);
        double fb = f(b,n);
        double fab = f(ab,n);
        boolean flag = false;
        while (fa * fb < 0 && a <= b - 0.001) {
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
            fa = f(a,n);
            fb = f(b,n);
            fab = f(ab,n);
        }
        if (!flag){
            System.out.printf("%.2f",ab);
        }
    }

    public static double f(double value,double[] n) {
        return n[3] * value * value * value + n[2] * value * value + n[1] * value + n[0];
    }
}

