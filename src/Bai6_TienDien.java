import java.util.Scanner;

public class Bai6_TienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số điện đầu tháng: ");
        int start = sc.nextInt();
        System.out.print("Mời nhập số điện cuối tháng: ");
        int end = sc.nextInt();
        int used = end - start;
       int rank = used/50;
       int mod = used%50;
       int tongNguyen = 50*(rank*(2*10000+(rank-1)*5000)/2);
       int tongDu = (10000+rank*5000)*mod;
        System.out.println("Tổng số điện là: " + (tongNguyen+tongDu));
    }

}
