package entity;

public class AdminThongTinPhim {
    private int id;
    private String tenphim;
    private String dienvien;
    private String daodien;
    private String quocgia;
    private int namsx;
    private String tomtat; 
    private String thoiluong;
    private String series;
    private int idphim;

    public AdminThongTinPhim() {
    }

    public AdminThongTinPhim(int id, String tenphim, String dienvien, String daodien, String quocgia, int namsx, String tomtat, String thoiluong, String series, int idphim) {
        this.id = id;
        this.tenphim = tenphim;
        this.dienvien = dienvien;
        this.daodien = daodien;
        this.quocgia = quocgia;
        this.namsx = namsx;
        this.tomtat = tomtat;
        this.thoiluong = thoiluong;
        this.series = series;
        this.idphim = idphim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
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

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
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

    public int getIdphim() {
        return idphim;
    }

    public void setIdphim(int idphim) {
        this.idphim = idphim;
    }

    @Override
    public String toString() {
        return "AdminThongTinPhim{" + "id=" + id + ", tenphim=" + tenphim + ", dienvien=" + dienvien + ", daodien=" + daodien + ", quocgia=" + quocgia + ", namsx=" + namsx + ", tomtat=" + tomtat + ", thoiluong=" + thoiluong + ", series=" + series + ", idphim=" + idphim + '}';
    }
    
}
