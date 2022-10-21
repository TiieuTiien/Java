import java.util.*;

public class BaoDongBacCau{

    public static void Out(int[][] baoDong, int size){
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++){
                System.out.print(baoDong[row][column] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void copyBaoDong(int[][] baoDongBacCau, int[][] baoDongBacCau2){
        for(int i = 0; i < baoDongBacCau.length; i++)
            baoDongBacCau2[i] = baoDongBacCau[i].clone();
    }
    public static void main(String[] args) {
        // System.out.print("Hay nhap vao m: ");
        // int m = sc.nextInt();
        // int k = sc.nextInt();
        // int temp = 0;
        
        // int[][] baoDongBacCau = new int[m][m];

        // for (int row = 0; row < m; row++) {
        //     for (int column = 0; column < m; column++){
        //         baoDongBacCau[row][column] = sc.nextInt();
        //     }
        // }
        // System.out.println("\n");

        // int[][] baoDongBacCau2 = new int[baoDongBacCau.length][];
        // copyBaoDong(baoDongBacCau, baoDongBacCau2);
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        int[][] c = new int[4][4];
        
        In(a, 4);
        In(b, 4);
        
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++){
                    c[row][column] = 0;
                    for (int i = 0; i < 3; i++){
                        c[row][column] += a[row][i]*b[i][column];
                    }
                    // if (temp >= 1){
                    //     baoDongBacCau2[row][column] = 1;
                    // }else{
                    //     baoDongBacCau2[row][column] = 0;
                    // }
                }
            }
        
        Out(c, 4);
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
}