package Mang;

import java.util.Scanner;

public class MaxMang2C {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7,8},
                {10,2,3,5},
                {11,2,6,4}
        };
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int indexOfMax=0;
        for (int i = 0;i<arr.length;i++){
            max=arr[0][0];
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
