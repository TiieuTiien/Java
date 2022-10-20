import java.util.*;

public class BaoDongBacCau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap vao m: ");
        int m = sc.nextInt();
        int temp;
        
        int[][] baoDongBacCau = new int[m][m];

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < m; column++){
                System.out.print("Hay nhap phan tu thu [" + row + "] [" + column + "] :");
                baoDongBacCau[row][column] = sc.nextInt();
            }
        }

        int[][] baoDongBacCau2 = baoDongBacCau.clone();
        for (int k = 0; k < 4; k++){
            for (int row = 0; row < m; row++) {
                for (int column = 0; column < m; column++){
                    temp = 0;
                    for (int i = 0; i < m; i++){
                        temp += baoDongBacCau[row][i]*baoDongBacCau2[i][column];
                    }
                    if (temp >= 1){
                        baoDongBacCau2[row][column] = 1;
                    }
                }
            }

        }

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < m; column++){
                System.out.print(baoDongBacCau[row][column] + " ");
            }
            System.out.println("\n");
        }

        sc.close();
    }
}