import java.util.Arrays;

public class _53_MangJava {
    public static void main(String[] args) {
        //Kieu nguyen thuy  
        int[] mang1 ={1, 2, 3};

        //Copy mang
        int[] mang1_a = mang1;
        mang1_a[0] = 100;

        System.out.println("Mang 1 la: " + Arrays.toString(mang1));
        System.out.println("Mang 1 a la: " + Arrays.toString(mang1_a));

        //clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;
        
        System.out.println("Mang 1 b la: " + Arrays.toString(mang1_b));
    }
}