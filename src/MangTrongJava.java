import java.util.Scanner;

public class MangTrongJava {
    public static void main(String[] args) {
        double[] mang1;
        mang1 = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mang1.length; i++){
            System.out.println("Nhap phan tu thu " + i + " = ");
            mang1[i] = sc.nextDouble();
        }
        double tong = 0;
        for (int j = 0; j < mang1.length; j++) {
            tong += mang1[j];
        }
        System.out.println(tong);
        sc.close();
    }    
}
