package cn.wzvtc.chapter03;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 80){
            System.out.println("优秀");
        }else if(score >= 70){
            System.out.println("良");
        }else if(score >= 60){
            System.out.println("中");
        }else{
            System.out.println("差");
        }
    }
}
