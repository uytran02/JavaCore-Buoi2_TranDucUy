import java.util.Scanner;

public class Bai7_SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào năm: ");
        int year = sc.nextInt();
        System.out.print("Mời nhập vào tháng: ");
        int month = sc.nextInt();
        //Kiểm tra năm nhuận
        //Năm nhuận là: Năm chia hết cho 4 nhưng không chia hết cho 100. Hoặc năm chia hết cho 400.
        boolean isLeapYear = false;
        if (year%4 == 0 && year%100 !=0){
            isLeapYear =true;
        } else if (year%400 == 0) {
            isLeapYear =true;
        }
        //Kiểm tra tháng
        if(isLeapYear && month ==2){
            System.out.println("Tháng 2 năm "+year+" có 29 ngày" );
        }else {
            switch (month){
                case 1:
                    System.out.println("Tháng 1 năm "+ year+" có 31 ngày");
                    break;
                case 2:
                    System.out.println("Tháng 2 năm "+ year+" có 28 ngày");
                    break;
                case 3:
                    System.out.println("Tháng 3 năm "+ year+" có 31 ngày");
                    break;
                case 4:
                    System.out.println("Tháng 4 năm "+ year+" có 30 ngày");
                    break;
                case 5:
                    System.out.println("Tháng 5 năm "+ year+" có 31 ngày");
                    break;
                case 6:
                    System.out.println("Tháng 6 năm "+ year+" có 30 ngày");
                    break;
                case 7:
                    System.out.println("Tháng 7 năm "+ year+" có 31 ngày");
                    break;
                case 8:
                    System.out.println("Tháng 8 năm "+ year+" có 31 ngày");
                    break;
                case 9:
                    System.out.println("Tháng 9 năm "+ year+" có 31 ngày");
                    break;
                case 10:
                    System.out.println("Tháng 10 năm "+ year+" có 31 ngày");
                    break;
                case 11:
                    System.out.println("Tháng 11 năm "+ year+" có 30 ngày");
                    break;
                case 12:
                    System.out.println("Tháng 12 năm "+ year+" có 31 ngày");
                    break;
            }
        }
    }
}
