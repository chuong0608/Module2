import java.util.Scanner;

public class timGiaTri {
    public static void main(String[] args) {
        String[] student = {"Anh", "Hoa", "Son", "Tinh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh : ");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(input_name)) {
                System.out.print(" Vị trí của sinh viên trong danh sách " + input_name + " là" + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách");

        }
    }
}
