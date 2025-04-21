package labtuan3.BAI4;

import java.util.Scanner;
public class DSNhanVien {
    private NhanVien[] ds;
    private int soLuong;

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        soLuong = sc.nextInt();
        ds = new NhanVien[soLuong];

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap nhan vien thu " + (i + 1) + ":");
            ds[i] = new NhanVien();
            ds[i].input();
            ds[i].tinhLuong();
        }
    }

    public void xuatDS() {
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < soLuong; i++) {
            ds[i].output();
        }
    }
}

