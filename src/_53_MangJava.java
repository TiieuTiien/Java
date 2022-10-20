import java.util.Arrays;

public class _53_MangJava {
    public static void main(String[] args) {
        //Kieu nguyen thuy  
        int[] mang1 ={1, 2, 3};

        //Copy mang cach 1 - dung =
        int[] mang1_a = mang1;
        mang1_a[0] = 100;

        System.out.println("Mang 1 la: " + Arrays.toString(mang1));
        System.out.println("Mang 1 a la: " + Arrays.toString(mang1_a));

        //Copy mang cach 2 - dung clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        
        System.out.println("Mang 1 b la: " + Arrays.toString(mang1_b));

        //Copy mang cach 3 - dung System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
        mang1_c[0] = 90;

        System.out.println("Mang 1 c: " + Arrays.toString(mang1_c));
    }
}