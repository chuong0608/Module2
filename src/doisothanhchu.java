import java.sql.SQLOutput;
import java.util.Scanner;

public class doisothanhchu {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nhập số");
        int num = scanner.nextInt();
        String[] arr={"không", "một","hai","ba","bốn","năm","sáu","bảy","tám","chín","mười"};
        String chuoi = "";
        if(num>0 && num <10){
            chuoi = arr[num];
        }
        if(num >=10 && num <20){
            chuoi=" mười " + arr[num%10];
        }
        if(num>=20 & num<100){
            if(num%10==0) {
                chuoi = arr[num/10] + " mươi ";
            }
            else if(num%10==1){
                chuoi=arr[num%10] + " mươi " + "mốt";
            }else {
                chuoi=arr[num%10] + " mươi " + arr[num%10];
            }
        }
        System.out.println(chuoi);
    }
}
