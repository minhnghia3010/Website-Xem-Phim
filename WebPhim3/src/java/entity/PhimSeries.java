package entity;

public class PhimSeries {
    private int id ;
    private String tenphim ;
    private String series ;
    private String thoiluong;
    private int luotxem;
    private int namsx;
    private String anh;

    public PhimSeries() {
    }

    public PhimSeries(int id, String tenphim, String series, String thoiluong, int luotxem, int namsx, String anh) {
        this.id = id;
        this.tenphim = tenphim;
        this.series = series;
        this.thoiluong = thoiluong;
        this.luotxem = luotxem;
        this.namsx = namsx;
        this.anh = anh;
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(String thoiluong) {
        this.thoiluong = thoiluong;
    }

    public int getLuotxem() {
        return luotxem;
    }

    public void setLuotxem(int luotxem) {
        this.luotxem = luotxem;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "PhimSeries{" + "id=" + id + ", tenphim=" + tenphim + ", series=" + series + ", thoiluong=" + thoiluong + ", luotxem=" + luotxem + ", namsx=" + namsx + ", anh=" + anh + '}';
    }
    
}
