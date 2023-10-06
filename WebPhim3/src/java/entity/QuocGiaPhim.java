package entity;

public class QuocGiaPhim {
    private String quocgia;
    private int soluong;

    public QuocGiaPhim() {
    }

    public QuocGiaPhim(String quocgia, int soluong) {
        this.quocgia = quocgia;
        this.soluong = soluong;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "QuocGiaPhim{" + "quocgia=" + quocgia + ", soluong=" + soluong + '}';
    }
    
    
}
