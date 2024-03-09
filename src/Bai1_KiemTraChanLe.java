import java.util.Scanner;

public class Bai1_KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập một số nguyên: ");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Số nguyên vừa nhập là số chẵn ");
        }else {
            System.out.println("Số nguyên vừa nhập là số lẻ ");
        }
    }
}
