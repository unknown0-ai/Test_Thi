package com.example.Thi_SOF3041;

public class BaiHat {
    private String ma;
    private String ten;
    private String tenCasi;
    private float thoiluong;
    private String theloai;

    public BaiHat() {
    }

    public BaiHat(String ma, String ten, String tenCasi, float thoiluong, String theloai) {
        this.ma = ma;
        this.ten = ten;
        this.tenCasi = tenCasi;
        this.thoiluong = thoiluong;
        this.theloai = theloai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenCasi() {
        return tenCasi;
    }

    public void setTenCasi(String tenCasi) {
        this.tenCasi = tenCasi;
    }

    public float getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(float thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
}
