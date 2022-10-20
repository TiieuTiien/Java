import java.util.Arrays;

public class _53_MangJava {
    public static void main(String[] args) {
        //Kieu nguyen thuy  
        int[] mang1 ={1, 2, 3};

        //Copy mang
        int[] mang1_a = mang1;

        System.out.println("Mang 1 la: " + Arrays.toString(mang1));
        System.out.println("Mang 1a la: " + Arrays.toString(mang1_a));
    }
}