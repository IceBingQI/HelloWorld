package cn.wzvtc.T;

import java.util.Scanner;

public class T7_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr=new int[n+1];
        int index = 1,num = 1,count = n;
        while (n!=1){
            if (arr[index]==0&&num==3){
                arr[index]=1;
                n--;
                if (index==count){
                    index=1;
                }else {
                    index++;
                }
                num=1;
                continue;
            }
            if (arr[index]==0){
                num++;
                if (index==count){
                    index=1;
                }else {
                    index++;
                }
            }else {
                if (index==count){
                    index=1;
                }else {
                    index++;
                }
            }
        }
        for (int i =1;i<=count;i++){
            if (arr[i]==0){
                System.out.println(i);
                break;
            }
        }
    }
}