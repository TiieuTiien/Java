public class _31_Main {
    public static void main(String[] args) {
        _31_PhuongThuc Hoadon = new _31_PhuongThuc("Trung nguyen", 100, 1.5);
        System.out.println("Tong tien = " + Hoadon.tinhTongTien());
        System.out.println("Kiem tra khoi luong lon hon 2kg: " + Hoadon.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem tra gia cua hoa don lon hon 500k: " + Hoadon.kiemTraTongTienLonHon500k());
    }
}