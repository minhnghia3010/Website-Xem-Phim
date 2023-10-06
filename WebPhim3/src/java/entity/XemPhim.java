package entity;

public class XemPhim {
    private int id;
    private String tenphim;
    private String anh;
    private String link;
    private int luotxem;
    private String quocgia;
    private String tomtat;
    private int namsx;
    private String thoiluong;
    private String series;

    public XemPhim() {
    }

    public XemPhim(int id, String tenphim, String anh, String link, int luotxem, String quocgia, String tomtat, int namsx, String thoiluong, String series) {
        this.id = id;
        this.tenphim = tenphim;
        this.anh = anh;
        this.link = link;
        this.luotxem = luotxem;
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

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getLuotxem() {
        return luotxem;
    }

    public void setLuotxem(int luotxem) {
        this.luotxem = luotxem;
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
        return "XemPhim{" + "id=" + id + ", tenphim=" + tenphim + ", anh=" + anh + ", link=" + link + ", luotxem=" + luotxem + ", quocgia=" + quocgia + ", tomtat=" + tomtat + ", namsx=" + namsx + ", thoiluong=" + thoiluong + ", series=" + series + '}';
    }
    
}
