import java.util.Arrays;
import java.util.Scanner;

public class Bai9_4SoGiamDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        float[] arrNum = new float[n];
        //Nhồi vào mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Mời nhập số thứ "+ (i+1)+": ");
            arrNum[i] = sc.nextFloat();
        }
        //Sắp xếp
        int min;
        float temp;
        for(int i =0; i< arrNum.length; i++){
            min = i ;
            for (int j = i+1; j<arrNum.length; j++){
                if (arrNum[j]<arrNum[min]){
                    min = j;
                }
                //Hoán đổi vị trí
                temp = arrNum[i];
                arrNum[i] = arrNum[min];
                arrNum[min] = temp;
            }
        }
        //In thứ tự ra màn hình
        System.out.print("Các số xếp theo thứ tự là: ");
        for(int i=0;i<arrNum.length;i++){
            System.out.print(arrNum[i] + "| ");
        }
    }
}
