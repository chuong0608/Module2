import java.util.Scanner;

class KiemTraSoNguyenTo {
    public static void main(String args[]) {
        int status = 1;
        int num = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                if(num<100){
                    System.out.println(num);
                }
                i++;
            }

            status = 1;
            num++;
        }
    }
}