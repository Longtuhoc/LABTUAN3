package labtuan3.BAI4;

import java.util.Scanner;
public class NhanVien {
    private int maSo;
    private String hoTen;
    private double luongCB;
    private float heSoLuong;
    private double luong;

    public NhanVien() {
        maSo = 0;
        hoTen = "";
        luongCB = 0;
        heSoLuong = 0;
        luong = 0;
    }

    public NhanVien(int maSo, String hoTen, double luongCB, float heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.luong = 0;
    }

    public NhanVien(NhanVien nv) {
        this.maSo = nv.maSo;
        this.hoTen = nv.hoTen;
        this.luongCB = nv.luongCB;
        this.heSoLuong = nv.heSoLuong;
        this.luong = nv.luong;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        maSo = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        luongCB = sc.nextDouble();
        System.out.print("Nhap he so luong: ");
        heSoLuong = sc.nextFloat();
    }

    public void output() {
        System.out.println(maSo + " - " + hoTen + " - " + luongCB + " - " + heSoLuong + " - Luong: " + luong);
    }

    public void tinhLuong() {
        luong = luongCB * heSoLuong;
    }

    public double getLuong() {
        return luong;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHoTen(String tenMoi) {
        hoTen = tenMoi;
    }
}

