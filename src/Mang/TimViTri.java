package Mang;

import java.util.Scanner;

public class TimViTri {
    public static void main(String[] args) {
        String[] arr = {"Hoa ", "Anh", "Như"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
