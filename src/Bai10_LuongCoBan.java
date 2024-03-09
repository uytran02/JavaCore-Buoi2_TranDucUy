import java.util.Scanner;

public class Bai10_LuongCoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số ngày công thực tế: ");
        int realDays = sc.nextInt();
        System.out.print("Mời nhập lương cơ bản: ");
        int realPages = sc.nextInt();
        double pages;
        if(realDays>26){
            pages = 26*realPages + 1.5*(realDays-26)*realPages;
        }else {
            pages = realPages*realDays;
        }
        System.out.print("Mức lương tháng rồi của bạn là: "+pages);
    }
}
