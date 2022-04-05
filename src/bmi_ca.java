import java.util.Scanner;

public class bmi_ca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng");
        double weight=scanner.nextDouble();
        System.out.println("Nhập vào chiều cao");
        double height = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        System.out.println(bmi+ " Interpretation\n");
        if(bmi<18){
            System.out.println(bmi + " Thiếu cân");
        }
        else if(bmi<25.0){
            System.out.println(bmi + " bình thường");
        }
        else if(bmi<30.0){
            System.out.println(bmi + " Thừa cân");
        }
        else {
            System.out.println(bmi + " béo phì");
        }
    }
}
