/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class DanhMuc {
    private int id;
    private String tendanhmuc;

    public DanhMuc() {
    }

    public DanhMuc(int id, String tendanhmuc) {
        this.id = id;
        this.tendanhmuc = tendanhmuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    @Override
    public String toString() {
        return "DanhMuc{" + "id=" + id + ", tendanhmuc=" + tendanhmuc + '}';
    }
}
