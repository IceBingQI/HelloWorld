package cn.wzvtc.T;

import java.util.Scanner;

public class T7_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (A == B && B != C){
            System.out.println("C");
        }else if (A != B && B==C){
            System.out.println("A");
        }else if (A == C && B != C){
            System.out.println("B");
        }else{
            System.out.println("三个球都不一样或输入有误");
        }
    }
}
