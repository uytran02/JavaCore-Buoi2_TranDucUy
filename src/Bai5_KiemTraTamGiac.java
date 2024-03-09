import java.util.Scanner;

public class Bai5_KiemTraTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh đầu tiên của tam giác: ");
        float edge1 = sc.nextFloat();
        System.out.print("Nhập cạnh thứ hai của tam giác: ");
        float edge2 = sc.nextFloat();
        System.out.print("Nhập cạnh thứ ba của tam giác: ");
        float edge3 = sc.nextFloat();
        //Biến kiểm tra tam giác
        boolean isTriangle = false ;
        boolean isIsosceles =false; //cân
        boolean isEquilateral=false; //đều
        boolean isRight =false ; //vuông
//Kiểm tra
        if (edge1 + edge2>edge3 && edge2 + edge3>edge1 && edge3 + edge1>edge2 && edge1>0 &&edge2>0 &&edge3>0){
          //Là tam giác
            isTriangle = true;
          //Kiểm tra cân và đều
            if (edge1 == edge2 || edge2 == edge3 || edge3 == edge1 ){
                isIsosceles = true;
            } else if (edge1 == edge2 && edge2 ==edge3) {
                isEquilateral = true;
            }
            //Kiểm tra vuông
            if (edge1*edge1 +edge2*edge2==edge3*edge3||edge2*edge2 +edge3*edge3==edge1*edge1||edge1*edge1 +edge3*edge3==edge2*edge2){
                isRight = true;
            }
        }
        //Hiển thị
        if (isEquilateral){
            System.out.println("Tam giác đã nhập là tam giác đều");
        } else if (isIsosceles == true && isRight == false) {
            System.out.println("Tam giác đã nhập là tam giác cân");
        }else if (isIsosceles == false && isRight == true) {
            System.out.println("Tam giác đã nhập là tam giác vuông");
        } else if (isIsosceles && isRight) {
            System.out.println("Tam giác đã nhập là tam giác vuông cân");
        } else if (isTriangle) {
            System.out.println("Tam giác đã nhập là tam giác thường");
        }else {
            System.out.println("Các số bạn nhập không thể tạo thành tam giác");
        }
    }
}
