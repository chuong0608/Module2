package Mang;

public class Moi {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,4},
                {45,34,56},
                {98,4,5}
        };

        System.out.println(timMax(arr));
    }
    static int timMax(int arr[][]){
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }return max;
    }
}
