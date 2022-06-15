package cn.wzvtc.chapter08;

import java.util.Scanner;

public class example04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[4][4];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]= scanner.nextDouble();
            }
        }
        double sum = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (i == j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
