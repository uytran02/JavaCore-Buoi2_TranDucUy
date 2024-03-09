import java.util.Scanner;

public class Bai2_DiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập điểm Javascript: ");
        float jsMark = sc.nextFloat();
        System.out.print("Mời nhập điểm HTML: ");
        float htmlMark = sc.nextFloat();
        System.out.print("Mời nhập điểm CSS: ");
        float cssMark = sc.nextFloat();
        float avgMark  = (jsMark + htmlMark + cssMark)/3;
        if(0<= avgMark && avgMark<5){
            System.out.println("Bạn đạt học lực yếu ");
        } else if (5 <= avgMark && avgMark < 7) {
            System.out.println("Bạn đạt học lực trung bình ");
        } else if (7 <= avgMark && avgMark< 8) {
            System.out.println("Bạn đạt học lực khá ");
        } else if (8 <= avgMark && avgMark< 9) {
            System.out.println("Bạn đạt học lực giỏi ");
        } else if (9 <= avgMark && avgMark< 10) {
            System.out.println("Bạn đạt học lực xuất sắc ");
        }else {
            System.out.println("Điểm của bạn ảo");
        }
    }
}
