package cn.wzvtc.moniti;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = 0;
        if (x>=0){
            if (x<15){
                y=4*x/3;
            }else {
                y=2.5*x-17.5;
            }
        }else{
            System.out.println("输入有误！");
        }

        System.out.printf("%.2f",y);
    }
}
