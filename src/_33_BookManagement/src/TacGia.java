public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;

    public TacGia (String ten, Ngay ngay){
        this.tenTacGia = ten;
        ngaySinh = ngay;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
