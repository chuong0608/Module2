package Mang;

import java.util.Scanner;

public class MinMang2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        int min =arr[0];
        int indexOfMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin++;
            };
        } System.out.println(min + " ở vị trí " + indexOfMin);

    }


}
