package cn.wzvtc.T;

import java.util.Scanner;

public class T7_27 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0;i<k;i++){
            arr[i]= scanner.nextInt();
        }
        for (int i=0;i<k;i++){
            if (n == 0){
                break;
            }
            for (int j =0;j<k-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int tmp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            n--;
        }
        for (int i=0;i<k;i++){
            System.out.print(arr[i]);
            if (i!=k-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
