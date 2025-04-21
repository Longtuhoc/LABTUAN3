package labtuan3.BAI5;

public class DemoTamGiac {
    public static void main(String[] args) {
        TamGiac tg1 = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiac(5, 5, 5);
        TamGiac tg3 = new TamGiac(6, 6, 10);

        System.out.println("Tam giac 1:");
        System.out.println("Chu vi: " + tg1.tinhChuVi());
        System.out.println("Dien tich: " + tg1.tinhDienTich());
        System.out.println("Loai: " + tg1.loaiTamGiac());

        System.out.println("\nTam giac 2:");
        System.out.println("Chu vi: " + tg2.tinhChuVi());
        System.out.println("Dien tich: " + tg2.tinhDienTich());
        System.out.println("Loai: " + tg2.loaiTamGiac());

        System.out.println("\nTam giac 3:");
        System.out.println("Chu vi: " + tg3.tinhChuVi());
        System.out.println("Dien tich: " + tg3.tinhDienTich());
        System.out.println("Loai: " + tg3.loaiTamGiac());
    }
}

