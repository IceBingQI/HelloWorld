package cn.wzvtc.T;

import java.util.Scanner;

public class T7_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int U = scanner.nextInt();
        int D = scanner.nextInt();
        int T = 0;
        while (N > 0){
            N = N - U;
            T = T + 1;
            if(N <= 0){
                break;
            }
            N = N + D;
            T = T + 1;
        }
        System.out.println(T);
    }
}
