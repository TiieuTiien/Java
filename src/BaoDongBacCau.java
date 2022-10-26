import java.util.*;

public class BaoDongBacCau{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap vao m: ");
        int m = sc.nextInt();
        short[][] matrix1 = new short[m][m];
        short[][] matrix2 = new short[m][m];
        short[][] matrixMultiply = new short[m][m];
        short[][] sum = new short[m][m];

        In(matrix1, matrix2, sum, m, sc);
        multiply(matrix1, matrix2, matrixMultiply, sum);

    }
    public static void In(short[][] a, short[][] b, short[][] d, int m, Scanner sc) {  
        int i = 0, j = 0;
        System.out.println("Input elements of the matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextShort();
            }
            b[i] = a[i].clone();
            d[i] = a[i].clone();
        }
    }
    public static void multiply(short[][] a, short[][] b, short[][] c, short[][] d) {
        assert a[0].length == c.length: "width of matrix one must be equal to height of matrix two";
        System.out.println("");
        //takes the dot product of the rows and columns and adds them to output matrix
        for (short loop = 0; loop < 3; loop++){
            System.out.println("M (R" + (loop + 2) + ")");
            for(short i = 0; i<a.length; i++) {
                for(short j = 0; j< c[0].length; j++) {
                    c[i][j] = 0;
                    for(short k = 0; k < c[0].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    d[i][j] += c[i][j];
                    c[i][j] = (short) (c[i][j] > 0 ? 1 : 0);
                    d[i][j] = (short) (d[i][j] > 0 ? 1 : 0);
                }
            }
            for(short l = 0; l< c.length; l++) {
                for(short m = 0; m< c[0].length; m++) {
                    b[l][m] = c[l][m];
                }
            }
            Out(c);
        }
        System.out.println("\nM(R*)");
        Out(d);
        
    }
    public static void Out(short[][] c){
        for(short l = 0; l< c.length; l++) {
            for(short m = 0; m< c[0].length; m++) {
                System.out.print(c[l][m] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}