package cn.wzvtc.chapter16;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int l = arr.length;
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<10;i++){
            int n =scanner.nextInt();
            arr[n]=1;
        }
        for(int i =0;i<10;i++){
            if(arr[1]==1){
                System.out.println(i+" ");
            }
        }
    }
}
