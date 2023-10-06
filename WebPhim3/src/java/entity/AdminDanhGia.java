package entity;

public class AdminDanhGia {
    private int id;
    private String tentaikhoan;
    private String tenphim;
    private String noidung;
    private int diem;

    public AdminDanhGia() {
    }

    public AdminDanhGia(int id, String tentaikhoan, String tenphim, String noidung, int diem) {
        this.id = id;
        this.tentaikhoan = tentaikhoan;
        this.tenphim = tenphim;
        this.noidung = noidung;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "AdminDanhGia{" + "id=" + id + ", tentaikhoan=" + tentaikhoan + ", tenphim=" + tenphim + ", noidung=" + noidung + ", diem=" + diem + '}';
    }
    
}
