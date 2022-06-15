package cn.wzvtc.chapter08;

public class example03 {
    public static void main(String[] args) {
        int[][] arr = {
                {100,200,200,300},
                {100,100,100},
                {500,100}
        };
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            int groupSum = 0;
            for (int j =0;j<arr[i].length;j++){
                groupSum = groupSum + arr[i][j];
                sum = sum+arr[i][j];
            }
            System.out.printf("第%d个小组销售额为%d元\n",i+1,groupSum);
        }
        System.out.printf("总销售额为%d元",sum);
    }
}
