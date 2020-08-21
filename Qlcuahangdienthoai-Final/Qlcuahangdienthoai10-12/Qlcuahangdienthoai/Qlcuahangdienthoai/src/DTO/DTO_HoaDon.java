/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class DTO_HoaDon {
    int MaHD;
    String MaKH;
    String TenTK;
    double GiamGia;
    double TongTien;

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }
    String NgayLap;
    String MoTa;

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public String getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(String NgayLap) {
        this.NgayLap = NgayLap;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
}
