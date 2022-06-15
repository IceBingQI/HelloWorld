package cn.wzvtc.chapter08;

import java.util.Scanner;

public class example06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int lin = 0, row = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[] linSum = new int[4];
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum1 += arr[i][j];
            }
            linSum[i] = linSum[i] + sum1;
            sum1 = 0;
            for (int n = 0; n < linSum.length-1; n++) {
                if (linSum[n] < linSum[n+1]){
                    lin = n+2;
                }
            }
        }
        System.out.printf("数量最多的行是%d行\n", lin);
        int[] rowSum = new int[4];
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum2 += arr[j][i];
            }
            rowSum[i] = rowSum[i] + sum2;
            sum2 = 0;
            for (int n = 0; n < rowSum.length-1; n++) {
                if (rowSum[n] < rowSum[n+1]){
                    row=n+2;
                }
            }
        }
        System.out.printf("数量最多的列是%d列", row);
    }
}
