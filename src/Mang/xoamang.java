package Mang;

import java.util.Scanner;

public class xoamang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 87, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần xóa:");
        int n = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                arr[i]=arr[i+1];
                arr[arr.length-1]=0;
            } System.out.println(arr[i]);
        }
    }
}