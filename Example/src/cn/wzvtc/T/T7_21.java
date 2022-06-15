package cn.wzvtc.T;

import java.util.Scanner;

public class T7_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int flag = 0;
        for (int x=0;x<=100;x++){
            for (int y=x;y<=100;y++){
                if (x*x+y*y==n){
                    flag=1;
                    System.out.println(x+" "+y);
                    break;
                }
            }
        }
        if (flag==0){
            System.out.println("No Solution");
        }
    }
}
