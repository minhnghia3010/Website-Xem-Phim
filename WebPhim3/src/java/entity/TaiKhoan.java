package entity;

public class TaiKhoan {
    private int id;
    private String tentaikhoan;
    private String matkhau;
    private int quyen;

    public TaiKhoan() {
    }

    public TaiKhoan(int id, String tentaikhoan, String matkhau, int quyen) {
        this.id = id;
        this.tentaikhoan = tentaikhoan;
        this.matkhau = matkhau;
        this.quyen = quyen;
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

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "id=" + id + ", tentaikhoan=" + tentaikhoan + ", matkhau=" + matkhau + ", quyen=" + quyen + '}';
    }
    
}
