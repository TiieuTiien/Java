import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = sc.nextInt();

        int[][] a = new int[m][m];
        int[][] b = new int[m][m];
        int[][] c = new int[m][m];
        In(a, m);
        In(b, m);


        for (int row = 0; row < m; row++) {
            for (int column = 0; column < m; column++){
                c[row][column] = 0;
                for (int i = 0; i < m; i++){
                    c[row][column] += a[row][i]*b[i][column];
                }
            }
        }
        
        Out(c, m);
        sc.close();
    }

    public static void In(int[][] a, int size){
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++){
                a[row][column] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    public static void Out(int[][] a, int size){
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++){
                System.out.print(a[row][column] + " ");
            }
            System.out.println("\n");
        }
    }
}
