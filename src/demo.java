import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
       System.out.print("Nhập vào a");
        int a = scanner.nextInt();
        System.out.print("Nhập vào b");
        int b = scanner.nextInt();
        System.out.println("Tông = " +(a+b));
    }
}
