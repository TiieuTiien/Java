public class _51_CacHamTimKiemTrongJava {
    public static void main(String[] args) {
        String s1 = "Xin chao cac ban, Xin chao thay co, Xin chao cac cau";
        String s2 = "Xin chao";
        String s3 = "Xin chao 123";
        char c1 = 'o';

        //indexOf
        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2));
        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s3));
        
        //Vi tri tiep theo
        System.out.println("Vi tri cua s2 trong s1 la: " + s1.indexOf(s2, 19));

        //Tim kiem char
        System.out.println("Vi tri cua c2 trong s1 la: " + s1.indexOf(c1));
        System.out.println("Vi tri cua c2 trong s1 la: " + s1.indexOf(c1, 10));

        //lastIndexOf
        System.out.println("Vi tri sau cua s2 trong s1 la: " + s1.lastIndexOf(s2));
        System.out.println("Vi tri sau cua c1 trong s1 la: " + s1.lastIndexOf(c1));
    }
}