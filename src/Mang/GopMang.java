package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int soLuong = scanner.nextInt();
        int[] arr = new int[soLuong];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng 2 :");
        System.out.println("Nhập vào số lượng phần tử mảng 2: ");
        int soLuong2 = scanner.nextInt();
        int[] arr2 = new int[soLuong2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            arr2[i] = scanner.nextInt();
        }
        int [] arr3=new int[arr.length+arr2.length];
        System.arraycopy(arr,0,arr3,0,arr.length);
        System.arraycopy(arr2,0,arr3,arr.length,arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
