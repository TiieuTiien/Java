public class _52_CatNoiThayTheChuyenDoi {
    public static void main(String[] args) {
        String s1 = "Tien";
        String s2 = ".com";

        String s3 = s1 + s2;
        String s4 = s1.concat(s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        
        //Ham thay the replaceAll
        String s5 = "Tien.vn";
        String s6 = s5.replaceAll("Tien.vn", "Tien.com");
        System.out.println("s6 = " + s6);

        //toLowerCase -> chuyen ve thuong
        //tpUperCase  -> chuyen ve hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7 = " + s7);
        System.out.println("s8 = " + s8);

        //trim() -> xoa khoang trang du thua o hai dau
        String s9 = " cau nay chua khoang trang o hai dau ";
        System.out.println("s9 = " + s9.trim());

        //subString -> cat chuoi con
        String s10 = "Xin chao cac ban, minh la Tien.vn";
        String s11 = s10.substring(10);
        String s12 = s10.substring(9, 16);
        System.out.println("s11 = " + s11);
        System.out.println("s12 = " + s12);
    }
}