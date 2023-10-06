package entity;

public class AdminPhim {
    private int id;
    private String tenphim;
    private String anh;
    private String link;
    private String tentheloai;
    private String tendanhmuc;

    public AdminPhim() {
    }

    public AdminPhim(int id, String tenphim, String anh, String link, String tentheloai, String tendanhmuc) {
        this.id = id;
        this.tenphim = tenphim;
        this.anh = anh;
        this.link = link;
        this.tentheloai = tentheloai;
        this.tendanhmuc = tendanhmuc;
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

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    @Override
    public String toString() {
        return "AdminPhim{" + "id=" + id + ", tenphim=" + tenphim + ", anh=" + anh + ", link=" + link + ", tentheloai=" + tentheloai + ", tendanhmuc=" + tendanhmuc + '}';
    }
    
}
