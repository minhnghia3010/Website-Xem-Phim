package entity;

public class TongNguoiDung {
    private int nguoidung;

    public TongNguoiDung() {
    }

    public TongNguoiDung(int nguoidung) {
        this.nguoidung = nguoidung;
    }

    public int getNguoidung() {
        return nguoidung;
    }

    public void setNguoidung(int nguoidung) {
        this.nguoidung = nguoidung;
    }

    @Override
    public String toString() {
        return "TongNguoiDung{" + "nguoidung=" + nguoidung + '}';
    }
    
}
