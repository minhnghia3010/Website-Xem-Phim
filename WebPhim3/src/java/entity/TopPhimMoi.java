package entity;

public class TopPhimMoi {
    private int id;
    private String tenphim;
    private int luotxem;
    private String thoiluong;
    private String tomtat;
    private int namsx;
    private String anh;

    public TopPhimMoi() {
    }

    public TopPhimMoi(int id, String tenphim, int luotxem, String thoiluong, String tomtat, int namsx, String anh) {
        this.id = id;
        this.tenphim = tenphim;
        this.luotxem = luotxem;
        this.thoiluong = thoiluong;
        this.tomtat = tomtat;
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

    public int getLuotxem() {
        return luotxem;
    }

    public void setLuotxem(int luotxem) {
        this.luotxem = luotxem;
    }

    public String getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(String thoiluong) {
        this.thoiluong = thoiluong;
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

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "TopPhimMoi{" + "id=" + id + ", tenphim=" + tenphim + ", luotxem=" + luotxem + ", thoiluong=" + thoiluong + ", tomtat=" + tomtat + ", namsx=" + namsx + ", anh=" + anh + '}';
    }
    
}
