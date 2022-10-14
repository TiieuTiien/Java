import java.util.Scanner;

public class FromDecToBin_24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap n: ");
        n = sc.nextInt();
        String bin = "";

        while(n > 0){
            bin = (n%2) + bin;
            n /= 2;
        }

        System.out.println("Chuoi duoc chuyen doi la: " + bin);

        sc.close();
    }
}
