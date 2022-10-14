import java.util.Scanner;

public class GiaiPT2_18 {
    public static void main(String[] args) {
        //Phuong trinh bac 2: a*x^2 + b*x + c = 0
        //B1 tinh delta
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Hay nhap vao lan luot a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = b*b - 4*a*c;

        if (a == 0){
            System.out.println("Nhap du lieu sai");
        }else{
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }else if (delta == 0){
                x1 = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + x1);
            }else {
                x1 = (- b - Math.sqrt(delta))/(2*a);
                x2 = (  b - Math.sqrt(delta))/(2*a);
                System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            }
        sc.close();
        }
    }
}
