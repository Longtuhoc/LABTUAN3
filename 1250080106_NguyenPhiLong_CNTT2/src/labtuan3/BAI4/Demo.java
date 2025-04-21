package labtuan3.BAI4;

public class Demo {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien(102, "Phan Nguyen Gia Huy", 5000000, 2.5f);
        NhanVien nv3 = new NhanVien(nv2);

        System.out.println("Nhap thong tin cho nhan vien 1:");
        nv1.input();
        nv1.tinhLuong();
        nv2.tinhLuong();
        nv3.tinhLuong();

        nv1.output();
        nv2.output();
        nv3.output();

        nv3.setHoTen("Bui Ngo Quang Ly");
        System.out.println("Nhan vien 3 sau khi doi ten:");
        nv3.output();

        NhanVien max = nv1;
        if (nv2.getHeSoLuong() > max.getHeSoLuong()) max = nv2;
        if (nv3.getHeSoLuong() > max.getHeSoLuong()) max = nv3;

        System.out.println("Nhan vien co he so luong cao nhat:");
        max.output();

        DSNhanVien ds = new DSNhanVien();
        ds.nhapDS();
        ds.xuatDS();
    }
}

