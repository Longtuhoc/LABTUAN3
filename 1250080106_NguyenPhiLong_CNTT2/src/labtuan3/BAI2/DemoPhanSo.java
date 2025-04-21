package labtuan3.BAI2;

import java.util.Scanner;
public class DemoPhanSo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        System.out.print("p1 = ");
        p1.xuatPhanSo();
        
        p1.nhapPhanSo();
        System.out.print("p1 sau khi nhap = ");
        p1.xuatPhanSo();
        
        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("p2 = ");
        p2.xuatPhanSo();
        
        int t, m;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        t = scanner.nextInt();
        System.out.print("Nhap mau so: ");
        m = scanner.nextInt();
        PhanSo p3 = new PhanSo(t, m);
        System.out.print("p3 = ");
        p3.xuatPhanSo();
        
        System.out.println("Cong phan so p1 va phan so p3:");
        System.out.print("p1 = ");
        p1.xuatPhanSo();
        System.out.print("p3 = ");
        p3.xuatPhanSo();
        PhanSo tong = p1.cong(p3);
        System.out.print("p1 + p3 = ");
        tong.xuatPhanSo();
        
        PhanSo p4 = new PhanSo(tong);
        System.out.print("p4 = ");
        p4.xuatPhanSo();
        
        System.out.println("Nhan p4 voi p2:");
        System.out.print("p4 = ");
        p4.xuatPhanSo();
        System.out.print("p2 = ");
        p2.xuatPhanSo();
        PhanSo tich = p4.nhan(p2);
        System.out.print("p4 * p2 = ");
        tich.xuatPhanSo();
    }
}