package cn.wzvtc.T;

import java.util.Scanner;

public class T7_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y;
        if(x<=15){
            y=(4*x)/3;
            System.out.println(String.format("%.2f",y));
        }else{
            y=(2.5*x-17.5);
            System.out.println(String.format("%.2f",y));
        }
    }
}
