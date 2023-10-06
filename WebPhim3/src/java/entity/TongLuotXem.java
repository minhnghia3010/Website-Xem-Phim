/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class TongLuotXem {
    private int luotxem;

    public TongLuotXem() {
    }

    public TongLuotXem(int luotxem) {
        this.luotxem = luotxem;
    }

    public int getLuotxem() {
        return luotxem;
    }

    public void setLuotxem(int luotxem) {
        this.luotxem = luotxem;
    }

    @Override
    public String toString() {
        return "TongLuotXem{" + "luotxem=" + luotxem + '}';
    }
    
}
