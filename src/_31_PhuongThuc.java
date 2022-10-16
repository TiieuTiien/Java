
public class _31_PhuongThuc {
    private String tenLoai;
    private double giaTien;
    private double khoiLuong;
    
    public _31_PhuongThuc (String ten, double gia, double kl){
        tenLoai = ten;
        giaTien = gia;
        khoiLuong = kl;
    }

    public String getName() {
        return tenLoai;
    }

    public void setName(String name) {
        this.tenLoai = name;
    }

    public double tinhTongTien(){
        return this.giaTien * this.khoiLuong;
    }

    public boolean kiemTraKhoiLuongLonHon (double kl){
        return this.khoiLuong > kl;
    }

    public boolean kiemTraTongTienLonHon500k () {
        return this.tinhTongTien() > 500;
    }

}
