package entity;

public class NamsxPhim {
    private int namsx;
    private int soluong;

    public NamsxPhim() {
    }

    public NamsxPhim(int namsx, int soluong) {
        this.namsx = namsx;
        this.soluong = soluong;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "NamsxPhim{" + "namsx=" + namsx + ", soluong=" + soluong + '}';
    }
    
    
}
