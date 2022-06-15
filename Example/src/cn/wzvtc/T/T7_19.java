package cn.wzvtc.T;

import java.util.Scanner;

public class T7_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int flag=0;
        for(int i = 0; i < 100;i++){
            for(int x = 0; x < 50;x++){
                if(98 * i -199 * x == n){
                    System.out.printf("%d.%d",x,i);
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("No Solution");
        }
    }
}