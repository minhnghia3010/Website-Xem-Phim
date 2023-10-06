package entity;

public class DanhGiaPhim {
    private int idDG;
    private int idTK;
    private int idP;
    private String tentaikhoan;
    private String noidung;

    public DanhGiaPhim() {
    }

    public DanhGiaPhim(int idDG, int idTK, int idP, String tentaikhoan, String noidung) {
        this.idDG = idDG;
        this.idTK = idTK;
        this.idP = idP;
        this.tentaikhoan = tentaikhoan;
        this.noidung = noidung;
    }

    public int getIdDG() {
        return idDG;
    }

    public void setIdDG(int idDG) {
        this.idDG = idDG;
    }

    public int getIdTK() {
        return idTK;
    }

    public void setIdTK(int idTK) {
        this.idTK = idTK;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) {
        this.tentaikhoan = tentaikhoan;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    @Override
    public String toString() {
        return "DanhGiaPhim{" + "idDG=" + idDG + ", idTK=" + idTK + ", idP=" + idP + ", tentaikhoan=" + tentaikhoan + ", noidung=" + noidung + '}';
    }
    
}
