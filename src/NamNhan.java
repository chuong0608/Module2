import java.util.Scanner;

public class NamNhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm: ");
        int nam = scanner.nextInt();
        if (nam % 4 == 0) {
            if (nam % 100 == 0) {
                if (nam % 400 == 0) {
                    System.out.println(nam + "là năm nhuận");
                } else {
                    System.out.println(nam + "Không là năm nhuận");
                }
            } else {
                System.out.println(nam + "Không là năm nhuận");
            }
        } else {
            System.out.println(nam + " là năm nhuận");
        }
    }
}
