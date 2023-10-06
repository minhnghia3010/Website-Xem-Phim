package entity;

public class TongDanhGia {
    private int danhgia;

    public TongDanhGia() {
    }

    public TongDanhGia(int danhgia) {
        this.danhgia = danhgia;
    }

    public int getDanhgia() {
        return danhgia;
    }

    public void setDanhgia(int danhgia) {
        this.danhgia = danhgia;
    }

    @Override
    public String toString() {
        return "TongDanhGia{" + "danhgia=" + danhgia + '}';
    }
    
}
