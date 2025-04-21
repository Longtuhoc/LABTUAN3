package labtuan3.BAI2;

import java.util.Scanner;
public class PhanSo {
    private int tu;
    private int mau;
    
    public PhanSo() {
        tu = 0;
        mau = 1;
    }
    
    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public PhanSo(PhanSo p) {
        tu = p.tu;
        mau = p.mau;
    }
    
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tu = sc.nextInt();
        System.out.print("Nhap mau so: ");
        mau = sc.nextInt();
    }
    
    public void xuatPhanSo() {
        System.out.println(tu + "/" + mau);
    }
    
    private int UCLN(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return UCLN(a - b, b);
        else
            return UCLN(a, b - a);
    }
    
    private void rutGon() {
        int ucln = UCLN(tu, mau);
        tu = tu / ucln;
        mau = mau / ucln;
    }
    
    public PhanSo cong(PhanSo p) {
        PhanSo kq = new PhanSo();       
        kq.mau = mau * p.mau;
        kq.tu = tu * p.mau + p.tu * mau;       
        kq.rutGon();
        return kq;
    }
    
    public PhanSo tru(PhanSo p) {
        PhanSo kq = new PhanSo();       
        kq.mau = mau * p.mau;
        kq.tu = tu * p.mau - p.tu * mau;        
        kq.rutGon();
        return kq;
    }
    
    public PhanSo nhan(PhanSo p) {
        PhanSo kq = new PhanSo();       
        kq.tu = tu * p.tu;
        kq.mau = mau * p.mau;       
        kq.rutGon();
        return kq;
    }
    
    public PhanSo chia(PhanSo p) {
        PhanSo kq = new PhanSo();        
        kq.tu = tu * p.mau;
        kq.mau = mau * p.tu;        
        kq.rutGon();
        return kq;
    }
}