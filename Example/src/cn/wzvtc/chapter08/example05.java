package cn.wzvtc.chapter08;

import java.util.Scanner;

public class example05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr1 = new double[4][4];
        double[][] arr2 = new double[4][4];
        for (int i=0;i< arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                arr1[i][j]= scanner.nextDouble();
            }
        }
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j<arr2[i].length;j++){
                arr2[i][j]= scanner.nextDouble();
            }
        }
        double[][] arr3 = arrayAdd(arr1,arr2);
        for (int i=0;i< arr3.length;i++){
            for (int j=0;j<arr3[i].length;j++){
                System.out.printf("%.2f ",arr3[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static double[][] arrayAdd(double[][] arr1,double[][] arr2){
        double[][] arr3 = new double[4][4];
        for (int i=0;i< 4;i++) {
            for (int j = 0; j < 4; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr3;
    }
}
