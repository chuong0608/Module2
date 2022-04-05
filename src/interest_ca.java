import java.util.Scanner;

public class interest_ca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền ");
        double money = scanner.nextDouble();
        System.out.println("Nhập só tháng");
        int month = scanner.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo tỉ lệ phần trăm");
        double interestRate = 0;
        interestRate = scanner.nextDouble();
        double tatal= 0;
        for(int i=0;i<month;i++){
            tatal += money * (interestRate/100)/12 * month;
        }
        System.out.println(tatal);
    }
}
