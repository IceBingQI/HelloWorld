package cn.wzvtc.T;

import java.util.Scanner;

public class T7_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int n = 0;
        int x = 0;
        for (int i = A;i <= B;i++){
            n+=i;
            x++;
            System.out.printf("%5d",i);
            if (x % 5 == 0) {
                System.out.println("");
            }
        }
        if(x != 5) {
            System.out.print("\n");
        }
        System.out.println("Sum = "+n);
    }
}
