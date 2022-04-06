package Mang;

import java.util.Scanner;

public class MangInMang {
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
        System.out.println("Vị trí cần thêm : ");
        int viTriThem = scanner.nextInt();

        int[] arr3 = new int[arr.length + arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if (i < viTriThem) {
                arr3[i] = arr[i];
            }
        }
        for (int i=0;i< arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
