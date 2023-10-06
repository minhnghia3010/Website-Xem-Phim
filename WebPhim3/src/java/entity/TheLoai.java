/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class TheLoai {
    private int id;
    private String tentheloai;

    public TheLoai() {
    }

    public TheLoai(int id, String tentheloai) {
        this.id = id;
        this.tentheloai = tentheloai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTentheloai() {
        return tentheloai;
    }

    public void setTentheloai(String tentheloai) {
        this.tentheloai = tentheloai;
    }

    @Override
    public String toString() {
        return "TheLoai{" + "id=" + id + ", tentheloai=" + tentheloai + '}';
    }
    
    
}
