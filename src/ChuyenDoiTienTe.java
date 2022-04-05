import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usd;
        System.out.println("Nhập vào tiền đô");
        usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println("Số tiền đổi được " + vnd);

    }
}
