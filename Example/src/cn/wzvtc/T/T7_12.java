package cn.wzvtc.T;

import java.util.Scanner;

public class T7_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String F;
        F = scanner.next();
        int B = scanner.nextInt();
        int C;
        switch (F){
            case "+":
                C=A+B;
                System.out.println(C);
                break;
            case "-":
                C=A-B;
                System.out.println(C);
                break;
            case "*":
                C=A*B;
                System.out.println(C);
                break;
            case "/":
                C=A/B;
                System.out.println(C);
                break;
            case "%":
                C=A%B;
                System.out.println(C);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
