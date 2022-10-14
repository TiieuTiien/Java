import java.util.Scanner;

public class TryCatchFinal_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        try {
            System.out.println("Hay nhap mot so nguyen: ");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("So vua nhap bi sai.");
        }
        System.out.println("So vua nhap la: " + n);
        System.out.println("Ket thuc chuong trinh.");

        sc.close();
    }
}