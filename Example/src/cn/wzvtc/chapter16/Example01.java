package cn.wzvtc.chapter16;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70){
            System.out.println("D");
        } else if (score >= 0 && score < 60){
            System.out.println("E");
        } else{
            System.out.println("输入有误");
        }
    }
}
