package entity;

public class ThongTinPhim {
    private int id;
    private String dienvien;
    private String daodien;
    private String quocgia;
    private String tomtat;
    private int namsx;
    private String thoiluong;
    private String series;

    public ThongTinPhim() {
    }

    public ThongTinPhim(int id, String dienvien, String daodien, String quocgia, String tomtat, int namsx, String thoiluong, String series) {
        this.id = id;
        this.dienvien = dienvien;
        this.daodien = daodien;
        this.quocgia = quocgia;
        this.tomtat = tomtat;
        this.namsx = namsx;
        this.thoiluong = thoiluong;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDienvien() {
        return dienvien;
    }

    public void setDienvien(String dienvien) {
        this.dienvien = dienvien;
    }

    public String getDaodien() {
        return daodien;
    }

    public void setDaodien(String daodien) {
        this.daodien = daodien;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(String thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "ThongTinPhim{" + "id=" + id + ", dienvien=" + dienvien + ", daodien=" + daodien + ", quocgia=" + quocgia + ", tomtat=" + tomtat + ", namsx=" + namsx + ", thoiluong=" + thoiluong + ", series=" + series + '}';
    }
    
    
}
