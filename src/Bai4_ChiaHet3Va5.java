import java.util.Scanner;

public class Bai4_ChiaHet3Va5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số nguyên: ");
        int number = sc.nextInt();
        if (number%15 == 0 ){
            System.out.println("Số đã nhập chia hết cho cả 3 và 5 ");
        }else {
            System.out.println("Số đã nhập không chia hết cho cả 3 và 5 ");
        }
    }
}
