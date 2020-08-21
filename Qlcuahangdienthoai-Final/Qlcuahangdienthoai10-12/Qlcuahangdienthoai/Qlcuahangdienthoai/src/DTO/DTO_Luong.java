/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author admin
 */
public class DTO_Luong {
    int MaLuong;
    String MaNV;
    double Luong1Gio;
    int SoGioLam;
    String NgayLam;
    double LuongLamThem;
    String MoTa;
    double TongLuong1Ngay;

    public double getLuong1Gio() {
        return Luong1Gio;
    }

    public void setLuong1Gio(double Luong1Gio) {
        this.Luong1Gio = Luong1Gio;
    }

    public int getSoGioLam() {
        return SoGioLam;
    }

    public void setSoGioLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }

    public String getNgayLam() {
        return NgayLam;
    }

    public void setNgayLam(String NgayLam) {
        this.NgayLam = NgayLam;
    }

    public double getLuongLamThem() {
        return LuongLamThem;
    }

    public void setLuongLamThem(double LuongLamThem) {
        this.LuongLamThem = LuongLamThem;
    }

    public double getTongLuong1Ngay() {
        return TongLuong1Ngay;
    }

    public void setTongLuong1Ngay(double TongLuong1Ngay) {
        this.TongLuong1Ngay = TongLuong1Ngay;
    }




    public int getMaLuong() {
        return MaLuong;
    }

    public void setMaLuong(int MaLuong) {
        this.MaLuong = MaLuong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }





    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
}
