package cn.wzvtc.T;

import java.util.Scanner;

public class T7_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        if(V<=60){
            System.out.println("Speed: "+V+" - OK");
        }else{
            System.out.println("Speed: "+V+" - Speeding");
        }
    }
}
