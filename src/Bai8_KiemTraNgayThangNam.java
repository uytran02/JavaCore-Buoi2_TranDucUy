import java.util.Scanner;

public class Bai8_KiemTraNgayThangNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào ngày: ");
        int day = sc.nextInt();
        System.out.print("Mời nhập vào tháng: ");
        int month = sc.nextInt();
        System.out.print("Mời nhập vào năm: ");
        int year = sc.nextInt();
        //Kiểm tra năm nhuận
        //Năm nhuận là: Năm chia hết cho 4 nhưng không chia hết cho 100. Hoặc năm chia hết cho 400.
        boolean isLeapYear = false;
        if (year%4 == 0 && year%100 !=0){
            isLeapYear =true;
        } else if (year%400 == 0) {
            isLeapYear =true;
        }
        //Điều kiện tổng quát
        if (year>0 && month>0 && month<13 && day>0 && day<32){
            //Kiểm tra ngày tháng trong tháng 2, năm nhuận
            if(isLeapYear && month == 2){
                if (0<day && day<30){
                    System.out.println("Ngày tháng năm hợp lệ ");
                }else {
                    System.out.println("Ngày tháng năm không hợp lệ ");
                }
            }//Kiểm tra các ngày tháng khác
            else {
                switch (month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        if (0<day && day<32){
                            System.out.println("Ngày tháng năm hợp lệ ");
                        }else {
                            System.out.println("Ngày tháng năm không hợp lệ ");
                        }
                        break;
                    case 4: case 6: case 9 : case 11:
                        if (0<day && day<31){
                            System.out.println("Ngày tháng năm hợp lệ ");
                        }else {
                            System.out.println("Ngày tháng năm không hợp lệ ");
                        }
                        break;
                    case 2:
                        if (0<day && day<29){
                            System.out.println("Ngày tháng năm hợp lệ ");
                        }else {
                            System.out.println("Ngày tháng năm không hợp lệ ");
                        }
                        break;
                    default:
                        System.out.println("Ngày tháng năm không hợp lệ ");
                }
            }
        }else{
            System.out.println("Ngày tháng năm không hợp lệ ");
        }
    }
}
