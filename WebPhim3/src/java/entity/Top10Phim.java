package entity;

public class Top10Phim {
    private int id;
    private String tenphim;
    private int namsx;
    private int luotxem;
    private String anh;

    public Top10Phim() {
    }

    public Top10Phim(int id, String tenphim, int namsx, int luotxem, String anh) {
        this.id = id;
        this.tenphim = tenphim;
        this.namsx = namsx;
        this.luotxem = luotxem;
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

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public int getLuotxem() {
        return luotxem;
    }

    public void setLuotxem(int luotxem) {
        this.luotxem = luotxem;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "Top10Phim{" + "id=" + id + ", tenphim=" + tenphim + ", namsx=" + namsx + ", luotxem=" + luotxem + ", anh=" + anh + '}';
    }
    
}
