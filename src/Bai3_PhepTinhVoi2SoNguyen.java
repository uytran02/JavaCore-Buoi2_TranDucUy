import java.util.Scanner;
public class Bai3_PhepTinhVoi2SoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mơi nhập số nguyên đầu tiên: ");
        int number1 = Integer.parseInt(sc.nextLine());
        System.out.print("Mơi nhập số nguyên thứ hai: ");
        int number2 = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập phép tính muốn tính: ");
        String cal = sc.nextLine();
        int result ;
        switch (cal){
            case "+":
                result = number1 + number2;
                System.out.println("Kết quả phép cộng hai số: "+result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Kết quả phép trừ hai số: "+result);
                break;
            case "*":
                result= number1*number2;
                System.out.println("Kết quả phép nhân hai số: "+result);
                break;
            case "/":
                result = number1/number2;
                System.out.println("Kết quả phép chia hai số: "+result);
                break;
            case "%":
                result = number1%number2;
                System.out.println("Kết quả phép lấy dư hai số: "+result);
                break;
            default:
                System.out.println("Phép tính không hợp lệ ");
        }

    }
}
